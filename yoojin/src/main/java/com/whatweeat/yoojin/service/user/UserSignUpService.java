package com.whatweeat.yoojin.service.user;
import com.whatweeat.yoojin.web.domain.user.UserRepository;
import com.whatweeat.yoojin.web.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserSignUpService {
    private final UserRepository userRepository;

    @Transactional
    public long save(UserRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity()).getId();
    }
}