package com.shoppingcart.io.domain.cart;

import com.shoppingcart.io.domain.policies.PricingPolicy;
import com.shoppingcart.io.domain.product.Product;

public class CartItem {
    private Product product;
    private PricingPolicy pricingPolicy;

    public CartItem(Product product, PricingPolicy pricingPolicy) {
        this.product = product;
        this.pricingPolicy = pricingPolicy;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public PricingPolicy getPricingPolicy() {
        return pricingPolicy;
    }

    public void setPricingPolicy(PricingPolicy pricingPolicy) {
        this.pricingPolicy = pricingPolicy;
    }
}
