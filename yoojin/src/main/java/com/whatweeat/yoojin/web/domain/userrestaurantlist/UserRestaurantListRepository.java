package com.whatweeat.yoojin.web.domain.userrestaurantlist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface UserRestaurantListRepository extends JpaRepository<UserRestaurantList, Long> {
    List<UserRestaurantList> findAllByCreatedTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}
