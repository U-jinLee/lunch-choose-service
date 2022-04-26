package com.whatweeat.yoojin.web.domain.list;

import com.whatweeat.yoojin.service.list.RestaurantListSaveService;
import com.whatweeat.yoojin.web.dto.RequestListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/list")
@RestController
public class RestaurantListRestController {
    private final RestaurantListSaveService restaurantListSaveService;

    @PostMapping ("")
    public void saveList(Authentication authentication, @RequestBody RequestListDto requestListDto) {
        restaurantListSaveService.saveRestaurant(authentication, requestListDto);
    }

}