package uk.ac.brunel.tescohackathonrecipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import uk.ac.brunel.tescohackathonrecipe.domain.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * This a new class.
 *
 * @author dom
 * @since 11/01/2018
 */
@Component
public class SampleData {

    private EntityManager entityManager;

    @Autowired
    public SampleData(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @EventListener
    @Transactional
    public void appReady(ApplicationReadyEvent event) {

        Person person = new Person();
        person.setName("John");

        entityManager.persist(person);
        entityManager.flush();

        Recipe recipe = new Recipe();
        recipe.setName("Bangers and mash");
        recipe.setRecipeCategory(RecipeCategory.MAINCOURSE);

        entityManager.persist(recipe);
        entityManager.flush();


    }
}
