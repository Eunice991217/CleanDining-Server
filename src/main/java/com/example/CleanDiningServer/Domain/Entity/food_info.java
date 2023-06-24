package com.example.CleanDiningServer.Domain.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "FoodInfo")
public class food_info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodinfo_id", unique = true, nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "locationinfo_id")
    private LocationInfo locationInfo;

    @Column
    private String name;

    @Column
    private String type;

    @Builder
    public food_info(String name, String type) {
        this.name= name;
        this.type= type;
    }

}
