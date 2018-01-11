package uk.ac.brunel.tescohackathonrecipe.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
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
    @JsonBackReference
    private Recipe recipe;

    @Transient
    private List<SpecificIngredient> specificIngredientList;

    private String name;
}
