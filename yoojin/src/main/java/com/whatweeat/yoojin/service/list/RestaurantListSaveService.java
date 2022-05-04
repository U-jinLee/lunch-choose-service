//package com.whatweeat.yoojin.service.list;
//
//import com.whatweeat.yoojin.web.domain.list.RestaurantListRepository;
//import com.whatweeat.yoojin.web.domain.user.User;
//import com.whatweeat.yoojin.web.domain.user.UserRepository;
//import com.whatweeat.yoojin.web.dto.RequestListDto;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.Authentication;
//import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class RestaurantListSaveService {
//
//    private final UserRepository userRepository;
//    private final RestaurantListRepository restaurantListRepository;
//
//    public long saveRestaurant(Authentication authentication, RequestListDto requestListDto) {
//        String email = authentication.getName();
//        User user = userRepository.findByEmail(email);
//
//        return restaurantListRepository.save(requestListDto.toEntity(user)).getId();
//    }
//
//}
