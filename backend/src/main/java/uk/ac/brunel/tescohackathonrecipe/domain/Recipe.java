package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Recipe Model
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(targetEntity = GenericIngredient.class, mappedBy = "id")
    private List<GenericIngredient> ingredients;

    @Enumerated(value = EnumType.STRING)
    private RecipeType recipeType;

}

