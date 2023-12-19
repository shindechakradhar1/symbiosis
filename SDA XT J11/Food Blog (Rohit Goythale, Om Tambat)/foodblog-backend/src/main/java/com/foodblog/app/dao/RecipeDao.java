package com.foodblog.app.dao;

import com.foodblog.app.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeDao extends MongoRepository<Recipe, String> {
    Recipe findByName(String recipeName);
}
