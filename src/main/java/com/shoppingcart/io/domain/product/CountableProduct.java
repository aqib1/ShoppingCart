package com.shoppingcart.io.domain.product;

import java.math.BigDecimal;

import static com.shoppingcart.io.domain.product.ProductType.COUNTABLE;


public non-sealed class CountableProduct extends Product {
    private int quantity;

    public CountableProduct(String productUUID, String name, BigDecimal productPrice, int quantity, boolean isAgeRestricted) {
        super(productUUID, name, productPrice, isAgeRestricted, COUNTABLE);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
