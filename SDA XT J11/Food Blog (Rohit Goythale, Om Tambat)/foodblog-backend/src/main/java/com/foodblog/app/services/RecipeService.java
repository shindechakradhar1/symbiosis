package com.foodblog.app.services;

import com.foodblog.app.ApiResponse;
import com.foodblog.app.model.Recipe;

public interface RecipeService {
    ApiResponse<String> addRecipe(Recipe recipe);
}
