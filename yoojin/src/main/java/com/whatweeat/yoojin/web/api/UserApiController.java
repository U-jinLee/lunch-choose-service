package com.whatweeat.yoojin.web.api;

import com.whatweeat.yoojin.service.user.UserSignUpService;
import com.whatweeat.yoojin.web.dto.UserRequestDto;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@RestController
public class UserApiController {
    private final UserSignUpService userSignUpService;

    /**
     * 회원가입 API
     * @param requestDto 회원정보
     * @return ResponseEntity 201 Created, requestDto.getId()
     * */
    @ApiOperation(value = "회원가입", notes = "회원가입 성공 시 회원 Id return")
    @PostMapping("")
    public ResponseEntity<Long> save(@RequestBody UserRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userSignUpService.save(requestDto));
    }

}