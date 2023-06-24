package com.example.CleanDiningServer.Repository;

import com.example.CleanDiningServer.Domain.Entity.food_info;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FoodInfoRepository {

    private final EntityManager em;

    public List<food_info> findAll(){
        String query = "SELECT f FROM food_info f";
        return em.createQuery(query, food_info.class)
                .getResultList();
    }
}
