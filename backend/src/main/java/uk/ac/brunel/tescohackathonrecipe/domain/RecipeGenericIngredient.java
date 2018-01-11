package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

/**
 * Generic Ingredient Model.
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
public class RecipeGenericIngredient {

    /**
     * Id of the generic ingredient.
     */
    @Id
    private String id = UUID.randomUUID().toString();

    /**
     * Recipe the generic ingredient belongs to.
     */
    @ManyToOne(targetEntity = Recipe.class)
    private Recipe recipe;

    private String name;
}
