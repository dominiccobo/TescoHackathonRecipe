package uk.ac.brunel.tescohackathonrecipe.exception;

import org.omg.SendingContext.RunTime;

/**
 * Exception for non found recipes.
 */
public class RecipeNotFoundException extends RuntimeException {

    public static final String API_ERROR_MESSAGE = "ERR_RECIPE_NOT_FOUND";

    public RecipeNotFoundException(String message) {
        super(message);
    }
}
