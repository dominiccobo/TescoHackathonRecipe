package uk.ac.brunel.tescohackathonrecipe.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Model of a person using the system.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Person {

    /**
     * unique id of the person
     */
    @Id
    private String id = UUID.randomUUID().toString();

    /**
     * Name of the person
     */
    private String name;

    /**
     * baskets owned by the person
     */
    @OneToMany(targetEntity = Basket.class, mappedBy = "id")
    private List<Basket> baskets;
}
