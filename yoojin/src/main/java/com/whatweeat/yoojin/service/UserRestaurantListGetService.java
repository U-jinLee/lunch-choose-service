package com.whatweeat.yoojin.service;

import com.whatweeat.yoojin.web.domain.userrestaurantlist.UserRestaurantListRepository;
import jdk.vm.ci.meta.Local;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RequiredArgsConstructor
@Getter
@Service
public class UserRestaurantListGetService {
    private final UserRestaurantListRepository userRestaurantListRepository;

    public void getUserRestaurantList() {
        LocalDateTime startDate = LocalDateTime.of(LocalDate.now(), LocalTime.of(0, 0, 0));
        LocalDateTime endDate = LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 59, 59));

        userRestaurantListRepository.findAllByCreatedTimeBetween(startDate, endDate);
    }

}
