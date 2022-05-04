package com.whatweeat.yoojin.web.domain.userrestaurantlist;

import com.whatweeat.yoojin.web.domain.BaseTimeEntity;
import com.whatweeat.yoojin.web.domain.restaurant.Restaurant;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class UserRestaurantList extends BaseTimeEntity {

    @Id
    @Column(name = "USER_RESTAURANT_LIST_ID", updatable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "RESTAURANT_ID")
    private Restaurant restaurant;
}
