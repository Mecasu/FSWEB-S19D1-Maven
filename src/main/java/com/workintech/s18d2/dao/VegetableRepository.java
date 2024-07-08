package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    @Query("SELECT v FROM Vegetable v ORDER BY v.price DESC")
    List<Fruit> getByPriceDesc();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price ASC")
    List<Fruit> getByPriceAsc();

    @Query("SELECT v FROM Vegetable v WHERE v.name ilike %:name%")
    List<Fruit> searchByName(String name);
}
