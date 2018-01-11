package uk.ac.brunel.tescohackathonrecipe.domain.templates;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.ac.brunel.tescohackathonrecipe.domain.Recipe;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeCategory;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeGenericIngredient;

import java.util.List;

/**
 * This a new class.
 *
 * @author dom
 * @since 11/01/2018
 */
@Getter
@Setter
@NoArgsConstructor
public class RecipeCreationRequest implements DomainConversionAdapter<Recipe>
{

    private String name;

    List<String> genericIngredients;

    RecipeCategory category;

    @Override
    public Recipe toParentDomain() {

        final Recipe recipe = new Recipe();
        recipe.setName(this.name);

        for(String ingredient: genericIngredients) {
            final RecipeGenericIngredient genericIngredient = new RecipeGenericIngredient();
            genericIngredient.setName(ingredient);
            genericIngredient.setRecipe(recipe);
            recipe.getIngredients().add(genericIngredient);
        }

        return recipe;
    }
}
