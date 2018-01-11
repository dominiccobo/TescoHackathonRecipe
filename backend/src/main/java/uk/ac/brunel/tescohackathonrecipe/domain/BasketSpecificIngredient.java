package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

/**
 * Model of an ingredient placed in a basket.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class BasketSpecificIngredient {

    /**
     * unique id
     */
    @Id
    private String id = UUID.randomUUID().toString();

    /**
     * Basket Ingredient belongs to
     */
    @ManyToOne(targetEntity = Basket.class)
    private Basket basket;

    /**
     * Specific Ingredient data.
     */
    private Integer specifiedIngredientId;

    /**
     * Number in basket
     */
    private Integer quantity;

}
