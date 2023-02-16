package com.company.service;

import com.company.service.product.Product;

public abstract class Control {
    private Product product;
    public abstract void checkControl(Product product);

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
