package uk.ac.brunel.tescohackathonrecipe.service;

import uk.ac.brunel.tescohackathonrecipe.domain.Recipe;

import java.util.List;

/**
 * This a new class.
 *
 * @author dom
 * @since 11/01/2018
 */
public interface RecipeService {

    /**
     * Create a recipe following the model
     * @param recipe the model to create
     * @return the created persisted model
     */
    Recipe createRecipe(Recipe recipe);

    /**
     * Retrieve a recipe by id
     * @param id the id of the recipe to retrieve.
     * @return the retrieved recipe.
     */
    Recipe getRecipeById(String id);


    /**
     * Retrieve recipes by search term
     * @param term term to search for
     * @param category category to serach in
     * @return list of recipes
     */
    List<Recipe> getRecipesBySearchTerm(String term, String category);


}
