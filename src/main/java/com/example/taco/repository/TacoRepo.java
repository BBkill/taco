package com.example.taco.repository;

import com.example.taco.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;

public interface TacoRepo extends JpaRepository<Taco, Integer> {
//    @Query(value = "SELECT t.id, t.name, t.")
//    Taco getRecent();
}
