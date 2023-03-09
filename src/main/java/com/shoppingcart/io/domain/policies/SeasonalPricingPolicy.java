package com.shoppingcart.io.domain.policies;

import com.shoppingcart.io.domain.product.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public record SeasonalPricingPolicy(BigDecimal discountPercentage) implements PricingPolicy {

    @Override
    public BigDecimal calculatePrice(Product product) {
        return product.getProductPrice().subtract(
          discountPercentage.multiply(BigDecimal.valueOf(100))
                  .divide(product.getProductPrice(), 5, RoundingMode.DOWN));
    }
}
