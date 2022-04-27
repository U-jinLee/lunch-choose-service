package com.whatweeat.yoojin.service.list;

import com.whatweeat.yoojin.web.domain.list.RestaurantList;
import com.whatweeat.yoojin.web.dto.ResponseRestaurantListDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantFormattedService {
    public List<ResponseRestaurantListDto> formatRestaurantList(List<RestaurantList> restaurantLists) throws Exception{
        List<ResponseRestaurantListDto> responseRestaurantListDtos = new ArrayList<>();

        for(RestaurantList restaurantList : restaurantLists) {
            ResponseRestaurantListDto responseRestaurantListDto =
                    ResponseRestaurantListDto.builder()
                            .restaurant(restaurantList.getRestaurant())
                            .userName(restaurantList.getUser().getUsername())
                            .build();

            responseRestaurantListDtos.add(responseRestaurantListDto);
        }

        return responseRestaurantListDtos;
    }
}
