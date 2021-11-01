package com.ehmr.spring.basics.springstepbystep.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDAO someCdiDAO;

    public int getSizeOfDB() {
        return someCdiDAO.getData().length;
    }
}
