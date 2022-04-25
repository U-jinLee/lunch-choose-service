package com.whatweeat.yoojin.web.domain.list;

import com.whatweeat.yoojin.service.list.ListSaveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/list")
@RestController
public class ListRestController {
    private final ListSaveService listSaveService;
    
    @PostMapping ("")
    public void saveList() {
        listSaveService.saveRestaurant();
        log.info("HelloWorld!");
    }

}