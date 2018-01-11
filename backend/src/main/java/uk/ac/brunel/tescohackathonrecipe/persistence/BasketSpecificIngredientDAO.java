package uk.ac.brunel.tescohackathonrecipe.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.brunel.tescohackathonrecipe.domain.Basket;

/**
 *
 */
public interface BasketSpecificIngredientDAO extends JpaRepository<Basket, String> {
}
