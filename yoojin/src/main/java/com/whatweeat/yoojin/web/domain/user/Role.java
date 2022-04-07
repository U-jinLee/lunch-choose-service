package com.whatweeat.yoojin.web.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    MASTER("ROLE_MASTER", "지배인"),
    MANAGER("ROLE_MANAGER", "관리자"),
    ISSUER("ROLE_ISSUER", "발행인"),
    SUPERVISOR("ROLE_SUPERVISOR", "감독관"),
    USER("ROLE_USER", "회원");

    private final String key;
    private final String title;
}