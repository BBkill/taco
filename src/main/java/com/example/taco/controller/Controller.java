package com.example.taco.controller;

import com.example.taco.model.Ingredient;
import com.example.taco.model.Taco;
import com.example.taco.service.TacoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/thuc-hanh")
public class Controller {

    private final TacoService service;

    @Autowired
    public Controller(TacoService service) {
        this.service = service;
    }

    @GetMapping("/ingredients")
    public ResponseEntity<List<Ingredient>> getAllIngredients() {
        return ResponseEntity.ok(service.getAllIngredient());
    }

    @GetMapping("/ingredient-{code}")
    public ResponseEntity<Ingredient> getIngredientByCode(@RequestParam(name = "code") String code) {
        return ResponseEntity.ok(service.getIngredient(code));
    }

    @PostMapping("/add-ingredient")
    public ResponseEntity<Ingredient> createIngredient(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(service.addIngredient(ingredient));
    }

    @PostMapping("/add-taco")
    public ResponseEntity<Taco> createTaco(@RequestBody Taco taco) {
        return ResponseEntity.ok(service.createTaco(taco));
    }

    @GetMapping("/tacos")
    public ResponseEntity<List<Taco>> getAllTaco() {
        return ResponseEntity.ok(service.getAllTaco());
    }
}
