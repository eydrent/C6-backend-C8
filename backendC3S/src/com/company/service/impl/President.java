package com.company.service.impl;

import com.company.service.Officer;

public class President extends Officer {
    @Override
    public void reedDocument(Integer classification) {
        if (classification <= 3)
            System.out.println("El presidente tiene acceso al documento");
    }
}
