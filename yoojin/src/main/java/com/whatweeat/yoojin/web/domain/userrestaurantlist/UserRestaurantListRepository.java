package com.whatweeat.yoojin.web.domain.userrestaurantlist;

import com.whatweeat.yoojin.web.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

    public interface UserRestaurantListRepository extends JpaRepository<UserRestaurantList, Long> {
        List<UserRestaurantList> findAllByCreatedTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
    Optional<UserRestaurantList> findByUserAndCreatedTimeBetween(User user, LocalDateTime startDate, LocalDateTime endDate);
}