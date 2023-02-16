package com.company;

import com.company.service.Officer;
import com.company.service.impl.Deputy;
import com.company.service.impl.Minister;
import com.company.service.impl.President;

public class Main {
    public static void main(String[] args) {
        Officer deputy = new Deputy();
        Officer minister = new Minister();
        Officer president = new President();

        deputy.setNextOfficer(minister);
        minister.setNextOfficer(president);

        president.reedDocument(1);
    }
}
