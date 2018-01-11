package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Basket {

    /**
     * Uniquely identifying basket id.
     */
    @Id
    private String id = UUID.randomUUID().toString();

    /**
     * Person the basket belongs to
     */
    @ManyToOne(targetEntity = Person.class)
    private String Person;

    /**
     *
     */
    @OneToMany(targetEntity = BasketSpecificIngredient.class, mappedBy = "specifiedIngredientId")
    private List<BasketSpecificIngredient> itemsInBasket;

}
