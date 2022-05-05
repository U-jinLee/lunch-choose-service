package com.whatweeat.yoojin.web.domain.restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findOneByName(String name);
}
