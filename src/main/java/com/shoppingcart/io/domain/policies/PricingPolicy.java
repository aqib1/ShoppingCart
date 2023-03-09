package com.shoppingcart.io.domain.policies;

import com.shoppingcart.io.domain.product.Product;

import java.math.BigDecimal;

public sealed interface PricingPolicy permits DefaultPricingPolicy, SeasonalPricingPolicy {
    BigDecimal calculatePrice(Product product);
}
