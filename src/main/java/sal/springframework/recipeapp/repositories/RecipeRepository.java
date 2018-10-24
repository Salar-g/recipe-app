package sal.springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import sal.springframework.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository <Recipe, Long> {
}
