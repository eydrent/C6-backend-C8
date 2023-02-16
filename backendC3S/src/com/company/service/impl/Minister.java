package com.company.service.impl;

import com.company.service.Officer;

public class Minister extends Officer {
    @Override
    public void reedDocument(Integer classification) {
        if(classification < 3)
            System.out.println("El ministro tiene acceso al documento");
        else if(getNextOfficer()!= null)
            System.out.println(("El ministro no tiene acceso, enviando el documento al Presi"));
        getNextOfficer().reedDocument(classification);
    }
}
