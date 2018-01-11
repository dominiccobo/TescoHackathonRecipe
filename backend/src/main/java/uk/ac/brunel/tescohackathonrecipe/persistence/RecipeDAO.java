package uk.ac.brunel.tescohackathonrecipe.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.brunel.tescohackathonrecipe.domain.Recipe;
import uk.ac.brunel.tescohackathonrecipe.domain.RecipeCategory;

import java.util.List;
import java.util.Optional;

/**
 *
 */
public interface RecipeDAO extends JpaRepository<Recipe, String> {

    /**
     * Retrieve a recipe by id
     * @param id the id
     * @return the container optionally containing a retrieved result if not null
     */
    Optional<Recipe> findById(String id);

    /**
     * Retrieve a recipe by search term or category.
     * @param name recipe name to search for
     * @param category category to search for.
     * @return the list of recipes retrieved.
     */
    List<Recipe> findByNameOrRecipeCategory(String name, RecipeCategory category);

}
