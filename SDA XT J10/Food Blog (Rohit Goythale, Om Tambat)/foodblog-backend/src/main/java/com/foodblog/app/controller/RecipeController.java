package com.foodblog.app.controller;

import com.foodblog.app.ApiResponse;
import com.foodblog.app.model.Recipe;
import com.foodblog.app.requests.RecipeRequest;
import com.foodblog.app.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Food Blog Backend!";
    }

    @PostMapping("/add-recipe")
    public ApiResponse<String> addRecipe(@RequestBody RecipeRequest request){
        return recipeService.addRecipe(new Recipe(null, request.getRecipeName(), request.getRecipeIngredients(), request.getRecipeSteps(), request.getRecipeType(), request.getRecipeImg()));
    }

    @PutMapping("/update-recipe")
    public ApiResponse<String> updateRecipe(@RequestBody RecipeRequest request){
        return null;
    }

}
