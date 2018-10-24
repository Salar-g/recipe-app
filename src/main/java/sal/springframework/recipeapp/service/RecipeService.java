package sal.springframework.recipeapp.service;

import sal.springframework.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
