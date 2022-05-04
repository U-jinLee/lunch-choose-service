package com.whatweeat.yoojin.web.domain.restaurant;

import com.whatweeat.yoojin.web.domain.BaseTimeEntity;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Restaurant extends BaseTimeEntity {
    @Id
    @Column(name = "RESTAURANT_ID", updatable = false)
    private long id;

    @Column
    private String restaurantName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Embedded
    private Like like;
}
