package com.shoppingcart.io.domain.offer;

import com.shoppingcart.io.domain.cart.CartItem;

import java.math.BigDecimal;
import java.util.List;

public sealed interface Offer permits NoOffer, BuyXGetYOffer {
    BigDecimal apply(List<CartItem> cartItems);
}
