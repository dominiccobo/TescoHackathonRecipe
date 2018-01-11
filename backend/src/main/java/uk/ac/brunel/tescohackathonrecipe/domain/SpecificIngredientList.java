package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class SpecificIngredientList {

    private List<SpecificIngredient> specificIngredients;
}
