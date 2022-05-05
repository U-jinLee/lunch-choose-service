package com.whatweeat.yoojin.service;

import com.whatweeat.yoojin.web.domain.restaurant.Restaurant;
import com.whatweeat.yoojin.web.domain.restaurant.RestaurantRepository;
import com.whatweeat.yoojin.web.domain.user.User;
import com.whatweeat.yoojin.web.domain.user.UserRepository;
import com.whatweeat.yoojin.web.domain.userrestaurantlist.UserRestaurantList;
import com.whatweeat.yoojin.web.domain.userrestaurantlist.UserRestaurantListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserRestaurantListSaveService {
    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;
    private final UserRestaurantListRepository userRestaurantListRepository;

    /**
     * 식당 이름이 있을 경우 해당 가게 이름을 넣고,
     * 없을 경우 해당 가게를 restaurant table에 저장한 후
     * 다시 불러온다.
     * */
    @Transactional
    public long userRestaurantSave(String email, String restaurantName) {

        Optional<User> user = userRepository.findOneByEmail(email);
        Optional<Restaurant> restaurant = restaurantRepository.findOneByName(restaurantName);

        if(restaurant.isPresent()) {
            UserRestaurantList userRestaurantList = UserRestaurantList.builder()
                    .user(user.get())
                    .restaurant(restaurant.get())
                    .build();

            long result = userRestaurantListRepository.save(userRestaurantList).getId();

            restaurant.get().getLike().plusCount();

            return result;
        } else {
            Restaurant restaurant2 = restaurantRepository.save(Restaurant.builder().user(user.get()).name(restaurantName).build());

            UserRestaurantList userRestaurantList = UserRestaurantList.builder().restaurant(restaurant2).user(user.get()).build();

            return userRestaurantListRepository.save(userRestaurantList).getId();
        }

    }

}
