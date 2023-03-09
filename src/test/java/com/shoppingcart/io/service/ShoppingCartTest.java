package com.shoppingcart.io.service;

import com.shoppingcart.io.domain.cart.CartItem;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

public class ShoppingCartTest {
    @Mock
    private ShoppingCart shoppingCart = mock(ShoppingCart.class);

    @Test
    public void addToCart_WhenCartItemProvided_success() {
        // when
        doNothing().when(shoppingCart).addToCart(any(CartItem.class));
    }



}
