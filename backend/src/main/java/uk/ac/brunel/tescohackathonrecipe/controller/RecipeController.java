package uk.ac.brunel.tescohackathonrecipe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.brunel.tescohackathonrecipe.domain.Recipe;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeCategory;
import uk.ac.brunel.tescohackathonrecipe.domain.templates.RecipeCreationRequest;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * Endpoint controller
 */
@RestController
@RequestMapping(value = "/recipes/")
public class RecipeController {

    /**
     * The List of recipes refined by parameters
     * @param category the category the recipe has
     * @param term the search term for the name of recipe.
     * @return response entity containing list of results.
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity getRecipes(@RequestParam(value = "category", required = false) String category,
                                     @RequestParam(value = "term", required = false) String term) {

        final List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe());
        recipeList.add(new Recipe());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(recipeList);

    }

    /**
     * Retrieve a recipe by id
     * @param id the id of the recipe to retrieve.
     * @return the retrieved recipe.
     */
    @RequestMapping(value = "/{id}/", method = RequestMethod.GET)
    public ResponseEntity getRecipeById(@PathVariable(value="id") String id) {

        final Recipe recipe = new Recipe();
        recipe.setId(id);
        recipe.setName("Bangers and Mash");
        recipe.setRecipeCategory(RecipeCategory.MAINCOURSE);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("");
    }

    /**
     * Retrieve list of categories
     * @return the response entity containing the body of list of categories
     */
    @RequestMapping(value = "/categories/", method = RequestMethod.GET)
    public ResponseEntity getRecipeTypes() {

        List<RecipeCategory> categories = new ArrayList<>(EnumSet.allOf(RecipeCategory.class));

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categories);
    }

    /**
     * Create a recipe
     * @param request the request body to process
     * @return the response entity
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity createRecipe(@RequestBody RecipeCreationRequest request) {

        return ResponseEntity
                .ok("");
    }
}
