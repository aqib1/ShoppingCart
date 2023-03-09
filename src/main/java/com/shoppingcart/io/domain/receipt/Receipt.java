package com.shoppingcart.io.domain.receipt;

import com.shoppingcart.io.domain.cart.CartItem;
import com.shoppingcart.io.domain.product.CountableProduct;
import com.shoppingcart.io.domain.product.NonCountableProduct;

import java.math.BigDecimal;
import java.util.List;

public class Receipt {
    private List<CartItem> cartItems;
    private BigDecimal totalCost;

    public Receipt(List<CartItem> cartItems, BigDecimal totalCost) {
        this.cartItems = cartItems;
        this.totalCost = totalCost;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("--------------Thanks for shopping ----------------\n");
        sb.append("\n Here is the break-down of your purchase\n");
        cartItems.forEach(item -> {
            sb.append("Item Name :").append(item.getProduct().getName()).append("\n");
            sb.append("Item price :").append(item.getProduct().getProductPrice()).append("\n");

            switch (item.getProduct().getProductType()) {
                case COUNTABLE -> sb.append("Number of items :").append(((CountableProduct)(item.getProduct())).getQuantity()).append("\n");
                case UNCOUNTABLE -> sb.append("Weight of item :").append(((NonCountableProduct)(item.getProduct())).getWeight()).append("\n");
            }

        });

        sb.append("-------------------------\n");
        sb.append("Total Cost : ").append(totalCost);

        return sb.toString();
    }
}
