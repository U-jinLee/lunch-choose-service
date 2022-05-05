package com.whatweeat.yoojin.web.domain.restaurant;

import com.whatweeat.yoojin.web.domain.BaseTimeEntity;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Restaurant extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESTAURANT_ID", updatable = false)
    private long id;

    @Column(name = "RESTAURANT_NAME", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Embedded
    private Like like;

    @Builder
    public Restaurant(String name, User user) {
        this.name = name;
        this.user = user;
        this.like = new Like(0);
    }
}
