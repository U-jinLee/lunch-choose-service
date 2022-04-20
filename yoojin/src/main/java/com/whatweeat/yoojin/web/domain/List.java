package com.whatweeat.yoojin.web.domain;

import com.whatweeat.yoojin.web.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class List extends BaseTimeEntity {
    @Id @GeneratedValue
    @Column(name = "LIST_ID",updatable = false)
    private long id;

    @OneToOne @JoinColumn(name = "USER_ID")
    private User user;

    private String restaurant;
}