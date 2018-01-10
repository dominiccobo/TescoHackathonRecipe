package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Generic Ingredient Model.
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
public class GenericIngredient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
