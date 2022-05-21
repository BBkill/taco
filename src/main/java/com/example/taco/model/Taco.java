package com.example.taco.model;


import lombok.*;
import net.bytebuddy.description.field.FieldDescription;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Date dateTime;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private Set<Ingredient> ingredients;

    public Taco(String name, Date dateTime, Set<Ingredient> ingredients) {
        this.name = name;
        this.dateTime = dateTime;
        this.ingredients = ingredients;
    }
}
