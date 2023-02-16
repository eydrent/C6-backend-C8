package com.company.service.impl;

import com.company.service.Officer;

public class Deputy extends Officer {
    @Override
    public void reedDocument(Integer classification) {
        if(classification == 1)
            System.out.println("El diputado tiene acceso al Documento");
        else if (getNextOfficer()!= null)
            System.out.println("El diputado no tiene acceso, enviando el documento al Ministro");
        getNextOfficer().reedDocument(classification);
    }
}
