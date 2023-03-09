package com.shoppingcart.io.domain.policies;

import com.shoppingcart.io.domain.product.Product;

import java.math.BigDecimal;

public non-sealed class DefaultPricingPolicy implements PricingPolicy {

    @Override
    public BigDecimal calculatePrice(Product product) {
        return product.getProductPrice();
    }
}
