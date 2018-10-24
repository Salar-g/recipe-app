package sal.springframework.recipeapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sal.springframework.recipeapp.service.RecipeService;

@Controller
public class Indexcontroller {


private final RecipeService recipeService;

    public Indexcontroller(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping ({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
