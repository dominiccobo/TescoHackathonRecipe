package uk.ac.brunel.tescohackathonrecipe.service;

import uk.ac.brunel.tescohackathonrecipe.domain.Basket;

/**
 * This a new class.
 *
 * @author dom
 * @since 11/01/2018
 */
public interface BasketService {

    Basket getBasket(String id);

    void updateBasket(Basket basket);
}
