package com.whatweeat.yoojin.web.dto;

import com.whatweeat.yoojin.web.domain.user.Role;
import com.whatweeat.yoojin.web.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Getter
@NoArgsConstructor
public class UserRequestDto {
    private String username;
    private String email;
    private String password;

    @Builder
    public UserRequestDto(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User toEntity() {
        return User
                .builder()
                    .username(username)
                    .email(email)
                    .password(password)
                    .role(Role.USER)
                .build();
    }

    public void encodePassword(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.password = bCryptPasswordEncoder.encode(this.password);
    }
}