package com.whatweeat.yoojin.web.domain.list;

import com.whatweeat.yoojin.service.list.RestaurantListSaveService;
import com.whatweeat.yoojin.web.dto.RequestListDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Long> saveList(Authentication authentication, @RequestBody RequestListDto requestListDto) {
        return ResponseEntity.status(HttpStatus.OK).body(restaurantListSaveService.saveRestaurant(authentication, requestListDto));
    }

}