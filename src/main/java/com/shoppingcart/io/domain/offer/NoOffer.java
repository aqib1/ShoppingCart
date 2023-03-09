package com.shoppingcart.io.domain.offer;

import com.shoppingcart.io.domain.cart.CartItem;

import java.math.BigDecimal;
import java.util.List;

public final class NoOffer implements Offer {
    @Override
    public BigDecimal apply(List<CartItem> cartItems) {
        BigDecimal count = BigDecimal.ZERO;
        for (CartItem cartItem : cartItems) {
            count = count.add(cartItem
                    .getPricingPolicy()
                    .calculatePrice(cartItem.getProduct()));
        }
        return count;
    }
}
