package com.example.CleanDiningServer.Domain.Dto;

import com.example.CleanDiningServer.Domain.Entity.food_info;
import lombok.Getter;

@Getter
public class FoodInfoResponseDto {
    private Long id;
    private String name;
    private String type;
    private double latitude;
    private double longitude;
    private String address;

    public FoodInfoResponseDto(food_info food) {
        this.id = food.getId();
        this.name = food.getName();
        this.type = food.getType();
        this.latitude = food.getLocationInfo().getLatitude();
        this.longitude = food.getLocationInfo().getLongitude();
        this.address = food.getLocationInfo().getAddress();
    }
}
