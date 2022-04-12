package com.whatweeat.yoojin.web.controller;

import com.whatweeat.yoojin.config.auth.PrincipalDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MapController {

    @GetMapping("/map")
    public String map(Authentication authentication, @AuthenticationPrincipal PrincipalDetails userDetails) {
        log.info("Authentication principal Info:{}", authentication.getPrincipal().toString());
        log.info("userDetailsPrincipal annotation: {}", userDetails.getUsername());
        return "map";
    }

}
