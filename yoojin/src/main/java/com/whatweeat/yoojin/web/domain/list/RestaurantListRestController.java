//package com.whatweeat.yoojin.web.domain.list;
//
//import com.whatweeat.yoojin.service.list.RestaurantFormattedService;
//import com.whatweeat.yoojin.service.list.RestaurantGetListService;
//import com.whatweeat.yoojin.service.list.RestaurantListSaveService;
//import com.whatweeat.yoojin.web.dto.RequestListDto;
//import com.whatweeat.yoojin.web.dto.ResponseRestaurantListDto;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Slf4j
//@RequiredArgsConstructor
//@RequestMapping("/api/v1/list")
//@RestController
//public class RestaurantListRestController {
//
//    private final RestaurantListSaveService restaurantListSaveService;
//    private final RestaurantGetListService restaurantGetListService;
//    private final RestaurantFormattedService restaurantFormattedService;
//
//    @GetMapping("")
//    public ResponseEntity<Map<String, Object>> getRestaurantList() throws Exception {
//        HashMap<String, Object> restaurantListResult = new HashMap<>();
//
//        List<RestaurantList> restaurantLists = restaurantGetListService.getList();
//        List<ResponseRestaurantListDto> formattedList = restaurantFormattedService.formatRestaurantList(restaurantLists);
//
//        restaurantListResult.put("list", formattedList);
//
//        return ResponseEntity.status(HttpStatus.OK).body(restaurantListResult);
//    }
//
//    @PostMapping ("")
//    public ResponseEntity<Long> saveList(Authentication authentication, @RequestBody RequestListDto requestListDto) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(restaurantListSaveService.saveRestaurant(authentication, requestListDto));
//    }
//
//}