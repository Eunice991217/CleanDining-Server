package com.example.CleanDiningServer.Controller;

import com.example.CleanDiningServer.Domain.Dto.FoodInfoResponseDto;
import com.example.CleanDiningServer.Service.FoodInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FoodInfoController {

    private final FoodInfoService foodInfoService;

    @GetMapping("/main")
    public List<FoodInfoResponseDto> searchAll(){
        return foodInfoService.searchAll();
    }
}
