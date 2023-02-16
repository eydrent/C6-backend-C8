package com.company.service.impl;

import com.company.service.Control;
import com.company.service.product.Product;

public class Container extends Control {

    public Container(Product product) {
        this.setProduct(product);
    }

    @Override
    public void checkControl(Product product) {
        if (product.getContainer().equals("casi sano") || product.getContainer().equals("sano")) {
            System.out.println("Container is OK");
        } else {
            System.out.println("Container is not OK");
        }
    }
}
