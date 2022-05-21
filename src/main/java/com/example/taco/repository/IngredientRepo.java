package com.example.taco.repository;

import com.example.taco.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient, Integer> {

    Ingredient findByCode(String code);
}
