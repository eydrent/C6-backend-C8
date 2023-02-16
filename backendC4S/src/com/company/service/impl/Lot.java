package com.company.service.impl;

import com.company.service.Control;
import com.company.service.product.Product;

public class Lot extends Control {


    public Lot(Product product) {
        this.setProduct(product);
    }

    @Override
        public void checkControl(Product product) {
            if (product.getLot() > 1000 && product.getLot() < 2000) {
                System.out.println("Lot is OK");
            } else {
                System.out.println("Lot is not OK");
            }
        }
}
