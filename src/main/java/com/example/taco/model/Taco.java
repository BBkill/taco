package com.example.taco.model;


import lombok.*;
import net.bytebuddy.description.field.FieldDescription;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    private int id;

    private String name;

    private Date dateTime;

    @ManyToMany
    private Set<Ingredient> ingredients;
}
