package uk.ac.brunel.tescohackathonrecipe.service;

import uk.ac.brunel.tescohackathonrecipe.domain.SpecificIngredient;

import java.util.List;

/**
 * This a new class.
 *
 * @author dom
 * @since 11/01/2018
 */
public interface IngredientService {

    List<SpecificIngredient> getIngredientsFromTescoDatabase(String ingredientName);
}
