package com.whatweeat.yoojin.service.user;
import com.whatweeat.yoojin.web.domain.user.UserRepository;
import com.whatweeat.yoojin.web.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserSignUpService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public long save(UserRequestDto requestDto) {
        return userRepository.save(requestDto.toEntity(bCryptPasswordEncoder)).getId();
    }

}