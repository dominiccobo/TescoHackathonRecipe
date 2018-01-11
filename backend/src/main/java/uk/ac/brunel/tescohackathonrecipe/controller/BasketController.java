package uk.ac.brunel.tescohackathonrecipe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.brunel.tescohackathonrecipe.domain.Basket;

/**
 *
 */
@RestController
@RequestMapping(value = "/basket/")
public class BasketController {

    @RequestMapping(value = "{id}/", method = RequestMethod.GET)
    public ResponseEntity getBasketById(@PathVariable ("id") String id) {

        Basket basket = new Basket();
        basket.setId(id);
        basket.setItemsInBasket(null);
        basket.setPerson(null);

        return ResponseEntity
                .ok(basket);
    }

    @RequestMapping(value = "{id}/", method = RequestMethod.PUT)
    public ResponseEntity updateBasketById(@PathVariable ("id") String id) {

        return ResponseEntity
                .ok("");
    }

}
