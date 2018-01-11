package uk.ac.brunel.tescohackathonrecipe.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.brunel.tescohackathonrecipe.domain.Basket;

/**
 * Basket name
 */
public interface BasketDAO extends JpaRepository<Basket, String> {
}
