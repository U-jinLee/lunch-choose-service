package com.whatweeat.yoojin.service.list;

import com.whatweeat.yoojin.web.domain.list.ListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ListSaveService {

    private final ListRepository listRepository;

    public void saveRestaurant() {}
}
