package com.shoppingcart.io.domain.product;

import java.math.BigDecimal;
import java.util.Objects;

public sealed class Product permits CountableProduct, NonCountableProduct {
    private String productUUID;
    private String name;
    private BigDecimal productPrice;
    private ProductType productType;
    private boolean ageRestricted;

    public Product(String productUUID, String name, BigDecimal productPrice, boolean ageRestricted, ProductType productType) {
        this.productUUID = productUUID;
        this.name = name;
        this.productPrice = productPrice;
        this.productType = productType;
        this.ageRestricted = ageRestricted;
    }

    public void setProductUUID(String productUUID) {
        this.productUUID = productUUID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductUUID() {
        return productUUID;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public boolean isAgeRestricted() {
        return ageRestricted;
    }

    public void setAgeRestricted(boolean ageRestricted) {
        this.ageRestricted = ageRestricted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return ageRestricted == product.ageRestricted && Objects.equals(productUUID, product.productUUID) && Objects.equals(name, product.name) && Objects.equals(productPrice, product.productPrice) && productType == product.productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productUUID, name, productPrice, productType, ageRestricted);
    }
}
