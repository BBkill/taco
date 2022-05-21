package com.example.taco.service;

import com.example.taco.model.Ingredient;
import com.example.taco.model.Taco;

import java.util.List;
import java.util.Set;

public interface TacoService {

    List<Ingredient> getAllIngredient();

    Ingredient getIngredient(String code);

    Ingredient addIngredient(Ingredient ingredient);

    Taco createTaco(Taco taco);

    Taco getRecent();

    List<Taco> getAllTaco();
}
