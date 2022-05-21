package com.example.taco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    public Ingredient(String code, String name, String type) {
        this.code = code;
        this.name = name;
        this.type = type;
    }
}
