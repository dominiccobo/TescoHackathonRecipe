package uk.ac.brunel.tescohackathonrecipe.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.brunel.tescohackathonrecipe.domain.GenericIngredient;

/**
 * This a new class.
 *
 * @author dom
 * @since 10/01/2018
 */
public interface GenericIngredientDAO extends JpaRepository<GenericIngredient, Long> {
}
