package uk.ac.brunel.tescohackathonrecipe.domain;

/**
 * This a new class.
 *
 * @author dom
 * @since 10/01/2018
 */
public enum RecipeCategory {

    BREAKFAST(0),
    MAINCOURSE(1),
    SNACK(2),
    DESSERTS(3),
    STARTER(4);

    final int id;

    RecipeCategory(int id) {
        this.id = id;
    }
}
