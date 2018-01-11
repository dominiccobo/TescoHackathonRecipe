package uk.ac.brunel.tescohackathonrecipe.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.brunel.tescohackathonrecipe.domain.Person;

/**
 *
 */
public interface PersonDAO extends JpaRepository<Person, String>{
}
