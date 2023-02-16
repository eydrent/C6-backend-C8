package com.company.service.impl;

import com.company.service.Control;
import com.company.service.product.Product;

public class Weight extends Control {

    public Weight(Product product) {
        this.setProduct(product);
    }

    @Override
        public void checkControl(Product product) {
            if (product.getWeight() > 1200 && product.getWeight() < 1500) {
                System.out.println("Weight is OK");
            } else {
                System.out.println("Weight is not OK");
            }
        }
}
