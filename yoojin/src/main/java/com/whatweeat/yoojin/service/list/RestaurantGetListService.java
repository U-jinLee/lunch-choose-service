package com.whatweeat.yoojin.service.list;

import com.whatweeat.yoojin.web.domain.list.RestaurantList;
import com.whatweeat.yoojin.web.domain.list.RestaurantListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantGetListService {

    private final RestaurantListRepository restaurantListRepository;

    public List<RestaurantList> getList() {
        return restaurantListRepository.findAll();
    }

}