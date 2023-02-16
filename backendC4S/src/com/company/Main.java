package com.company;

import com.company.service.Control;
import com.company.service.impl.Container;
import com.company.service.impl.Lot;
import com.company.service.impl.Weight;
import com.company.service.product.Product;

public class Main {

        public static void main(String[] args) {

            Product product = new Product(1, "cepillos", 1000, "casi sano", 1000);

            // write your code here
            Control lot = new Lot(product);
            lot.checkControl(product);
            Control weight = new Weight(product);
            weight.checkControl(product);
            Control container = new Container(product);
            container.checkControl(product);
        }
}
