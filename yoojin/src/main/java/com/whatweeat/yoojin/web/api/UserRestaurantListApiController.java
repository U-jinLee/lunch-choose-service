package com.whatweeat.yoojin.web.api;

import com.whatweeat.yoojin.service.UserRestaurantListGetService;
import com.whatweeat.yoojin.service.UserRestaurantListSaveService;
import com.whatweeat.yoojin.web.dto.RestaurantRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user-restaurant-list")
@RestController
public class UserRestaurantListApiController {

    private final UserRestaurantListGetService userRestaurantListGetService;
    private final UserRestaurantListSaveService userRestaurantListSaveService;

    /**
     * userRestaurantList에 있는 오늘 날짜의 컬럼을 모두 가져온다.
     * */
    @GetMapping("")
    public void findUserRestaurantList() {
        // I will soon make this controller function
    }

    /**
     * userRestaurant List에 식당을 저장한다.
     * */
    @PostMapping("")
    public void saveUserRestaurant(Authentication authentication, @RequestBody RestaurantRequestDto restaurantRequestDto) {
        String restaurantName = restaurantRequestDto.getName();
        String email = authentication.getName();
        userRestaurantListSaveService.userRestaurantSave(email, restaurantName);
    }

}