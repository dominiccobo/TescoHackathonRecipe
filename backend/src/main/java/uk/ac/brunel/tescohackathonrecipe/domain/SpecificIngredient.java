package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Model adhering to tesco's product retrieval.
 */
@Getter
@Setter
@NoArgsConstructor
public class SpecificIngredient {

    private Long productId;
}
