package com.shoppingcart.io.domain.offer;

import com.shoppingcart.io.domain.cart.CartItem;

import java.math.BigDecimal;
import java.util.List;

public non-sealed class BuyXGetYOffer implements Offer {

    @Override
    public BigDecimal apply(List<CartItem> cartItems) {
        return null;
    }
}
