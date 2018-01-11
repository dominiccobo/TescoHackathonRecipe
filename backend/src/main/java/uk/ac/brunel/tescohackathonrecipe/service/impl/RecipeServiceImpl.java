package uk.ac.brunel.tescohackathonrecipe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.brunel.tescohackathonrecipe.domain.Recipe;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeCategory;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeGenericIngredient;
import uk.ac.brunel.tescohackathonrecipe.domain.SpecificIngredient;
import uk.ac.brunel.tescohackathonrecipe.exception.RecipeNotFoundException;
import uk.ac.brunel.tescohackathonrecipe.persistence.RecipeDAO;
import uk.ac.brunel.tescohackathonrecipe.service.IngredientService;
import uk.ac.brunel.tescohackathonrecipe.service.RecipeService;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeDAO recipeDAO;
    private IngredientService ingredientService;

    @Autowired
    public RecipeServiceImpl(RecipeDAO recipeDAO, IngredientService ingredientService) {
        this.recipeDAO = recipeDAO;
        this.ingredientService = ingredientService;
    }


    @Override
    public Recipe createRecipe(Recipe recipe) {

        return this.recipeDAO.save(recipe);
    }

    @Override
    public Recipe getRecipeById(String id) {


        final Optional<Recipe> found = this.recipeDAO.findById(id);

        if(found.isPresent()) {

            List<RecipeGenericIngredient> genericIngredient = found.get().getIngredients();

            for(RecipeGenericIngredient item: genericIngredient) {

                List<SpecificIngredient> specificIngredients = ingredientService.getIngredientsFromTescoDatabase(item.getName());
                item.setSpecificIngredientList(specificIngredients);
            }

            return found.get();
        }
        throw new RecipeNotFoundException("Recipe was not found when retrieving by id: " + id);
    }

    @Override
    public List<Recipe> getRecipesBySearchTerm(String term, RecipeCategory category) {
        return this.recipeDAO.findByNameOrRecipeCategory(term, category);
    }
}
