package com.whatweeat.yoojin.web.domain.restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Like {
    private long likeCount;

    public void plusCount() {
        this.likeCount++;
    }
}
