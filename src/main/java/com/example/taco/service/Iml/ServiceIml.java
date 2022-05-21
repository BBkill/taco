package com.example.taco.service.Iml;

import com.example.taco.model.Ingredient;
import com.example.taco.model.Taco;
import com.example.taco.repository.IngredientRepo;
import com.example.taco.repository.TacoRepo;
import com.example.taco.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Service
public class ServiceIml implements TacoService {

    private final TacoRepo tacoRepo;
    private final IngredientRepo ingredientRepo;

    @Autowired
    public ServiceIml(TacoRepo tacoRepo, IngredientRepo ingredientRepo) {
        this.tacoRepo = tacoRepo;
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public List<Ingredient> getAllIngredient() {
        return ingredientRepo.findAll();
    }

    @Override
    public Ingredient getIngredient(String code) {
        return ingredientRepo.findByCode(code);
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    @Override
    public Taco createTaco(Taco taco) {
        java.util.Date date = new java.util.Date();
        taco.setDateTime(new Date(date.getTime()));
        return tacoRepo.save(taco);
    }

    @Override
    public Taco getRecent() {
        return null;
    }

    @Override
    public List<Taco> getAllTaco() {
        return tacoRepo.findAll();
    }
}
