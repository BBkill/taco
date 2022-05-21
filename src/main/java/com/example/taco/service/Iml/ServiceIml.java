package com.example.taco.service.Iml;

import com.example.taco.model.Ingredient;
import com.example.taco.model.Taco;
import com.example.taco.repository.IngredientRepo;
import com.example.taco.repository.TacoRepo;
import com.example.taco.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.HashSet;
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
        taco.setDateTime(getTime());
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

    private Date getTime() {
        java.util.Date date = new java.util.Date();
        return new Date(date.getTime());
    }

    //add data
    @Bean
    private void runner() {
//        ingredientRepo.save(new Ingredient("CORN", "bap", "main"));
//        ingredientRepo.save(new Ingredient("BEAN", "dau", "main"));
//        ingredientRepo.save(new Ingredient("CHEESE", "pho mai", "add"));
        ingredientRepo.save(new Ingredient("TOMATO", "ca chua", "main"));
        ingredientRepo.save(new Ingredient("ONION", "hanh", "main"));
//        ingredientRepo.save(new Ingredient("SALT", "muoi", "order"));
        ingredientRepo.save(new Ingredient("SUGAR", "duong", "order"));
        ingredientRepo.save(new Ingredient("B_MEAT", "thit bo", "main"));
        ingredientRepo.save(new Ingredient("C_MEAT", "thit ga", "main"));
//        ingredientRepo.save(new Ingredient("D_MEAT", "thi vit", "order"));
        ingredientRepo.save(new Ingredient("VEGETABLE", "slack", "main"));

        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(new Ingredient("CORN", "bap", "main"));
        ingredients.add(new Ingredient("BEAN", "dau", "main"));
        ingredients.add(new Ingredient("CHEESE", "pho mai", "add"));
        ingredients.add(new Ingredient("SALT", "muoi", "order"));
        ingredients.add(new Ingredient("D_MEAT", "thi vit", "order"));

        tacoRepo.save(new Taco("duc", getTime(), ingredients));
    }


}
