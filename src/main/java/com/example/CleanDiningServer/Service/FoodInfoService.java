package com.example.CleanDiningServer.Service;

import com.example.CleanDiningServer.Domain.Dto.FoodInfoResponseDto;
import com.example.CleanDiningServer.Repository.FoodInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FoodInfoService {

    private final FoodInfoRepository foodInfoRepository;

    @Transactional(readOnly = true)
    public List<FoodInfoResponseDto> searchAll(){
        return foodInfoRepository.findAll().stream()
                .map(FoodInfoResponseDto::new)
                .collect(Collectors.toList());
    }
}
