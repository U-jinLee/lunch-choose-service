package com.whatweeat.yoojin.web.domain.list;

import com.whatweeat.yoojin.web.domain.BaseTimeEntity;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class RestaurantList extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name = "LIST_ID", updatable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column
    private String restaurant;

    @Enumerated(EnumType.STRING)
    @Column
    private Active active;

    @Builder
    public RestaurantList(User user, String restaurant) {
        this.restaurant = restaurant;
        this.user = user;
        this.active = Active.ACTIVE;
    }
}