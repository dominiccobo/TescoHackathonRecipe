package uk.ac.brunel.tescohackathonrecipe.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Recipe Model
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Recipe {

    /**
     * Id of hte recipe
     */
    @Id
    private String id = UUID.randomUUID().toString();

    /**
     * Name of the recipe
     */
    private String name;

    /**
     * List of generic ingredients forming part of the recipe
     */
    @OneToMany(targetEntity = RecipeGenericIngredient.class, mappedBy = "id")
    @JsonManagedReference
    private List<RecipeGenericIngredient> ingredients;

    /**
     * Recipe Category
     */
    @Enumerated(value = EnumType.STRING)
    private RecipeCategory recipeCategory;

}

