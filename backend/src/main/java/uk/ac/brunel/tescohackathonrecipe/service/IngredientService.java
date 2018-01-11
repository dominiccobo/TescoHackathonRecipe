package uk.ac.brunel.tescohackathonrecipe.service;

import uk.ac.brunel.tescohackathonrecipe.domain.SpecificIngredient;

import java.util.List;

/**
 *
 */
public interface IngredientService {

    /**
     * Retrieve a list of ingredients from tesco's database matching a generic item.
     * @param ingredientName
     * @return
     */
    List<SpecificIngredient> getIngredientsFromTescoDatabase(String ingredientName);
}
