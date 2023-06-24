package com.example.CleanDiningServer.Domain.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "LocationInfo")
public class LocationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locationinfo_id",unique = true, nullable = false)
    private Long id;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Column
    private String address;

    @Builder
    public  LocationInfo(double latitude, double longitude, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
    }
}
