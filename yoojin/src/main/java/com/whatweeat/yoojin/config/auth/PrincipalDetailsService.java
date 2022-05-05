package com.whatweeat.yoojin.config.auth;

import com.whatweeat.yoojin.web.domain.user.User;
import com.whatweeat.yoojin.web.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userEntity = userRepository.findOneByEmail(email);

        log.info("받아온 이메일:{}, Repo에서 찾은 이메일:{}, Repo에서 찾은 role: {}", email, userEntity.get().getEmail(), userEntity.get().getRole().getKey());
        if(userEntity.isPresent()) return new PrincipalDetails(userEntity.get());
        return null;
    }
}
