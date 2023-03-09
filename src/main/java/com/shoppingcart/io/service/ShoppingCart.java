package com.shoppingcart.io.service;

import com.shoppingcart.io.domain.cart.CartItem;
import com.shoppingcart.io.domain.offer.Offer;
import com.shoppingcart.io.domain.receipt.Receipt;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    private final List<CartItem> cartItems;
    private final Offer offer;

    public ShoppingCart(List<CartItem> cartItems, Offer offer) {
        this.cartItems = cartItems;
        this.offer = offer;
    }

    public void addToCart(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

    private BigDecimal calculateCost() {
        return offer.apply(cartItems);
    }

    public Receipt checkOut() {
        return new Receipt(cartItems, calculateCost());
    }

}
