package com.whatweeat.yoojin.web.api;

import com.whatweeat.yoojin.service.user.UserSignUpService;
import com.whatweeat.yoojin.web.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("")
    public ResponseEntity<Long> save(@RequestBody UserRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userSignUpService.save(requestDto));
    }

}