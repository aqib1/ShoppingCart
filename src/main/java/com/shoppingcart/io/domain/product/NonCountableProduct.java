package com.shoppingcart.io.domain.product;

import java.math.BigDecimal;

import static com.shoppingcart.io.domain.product.ProductType.UNCOUNTABLE;

public non-sealed class NonCountableProduct extends Product {
    private BigDecimal weight;

    public NonCountableProduct(String productUUID, String name, BigDecimal productPrice, BigDecimal weight, boolean isAgeRestricted) {
        super(productUUID, name, productPrice, isAgeRestricted, UNCOUNTABLE);
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
