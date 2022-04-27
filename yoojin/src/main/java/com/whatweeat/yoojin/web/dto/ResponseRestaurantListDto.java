package com.whatweeat.yoojin.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponseRestaurantListDto {
    private String restaurant;
    private String userName;

    @Builder
    public ResponseRestaurantListDto(String restaurant, String userName) {
        this.restaurant = restaurant;
        this.userName = userName;
    }

}
