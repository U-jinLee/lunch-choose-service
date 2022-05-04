package com.whatweeat.yoojin.web.domain.restaurant;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@Embeddable
public class Like {
    private long likeCount;
}
