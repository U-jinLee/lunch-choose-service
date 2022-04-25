package com.whatweeat.yoojin.web.domain.list;

import com.whatweeat.yoojin.web.domain.BaseTimeEntity;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class List extends BaseTimeEntity {
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
}