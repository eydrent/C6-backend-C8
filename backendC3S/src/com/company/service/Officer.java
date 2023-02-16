package com.company.service;

public abstract class Officer {

    private Officer nextOfficer;

    public abstract void reedDocument(Integer classification);

    public Officer getNextOfficer() {
        return nextOfficer;
    }

    public void setNextOfficer(Officer nextOfficer) {
        this.nextOfficer = nextOfficer;
    }
}
