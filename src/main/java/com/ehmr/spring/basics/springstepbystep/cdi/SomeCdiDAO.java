package com.ehmr.spring.basics.springstepbystep.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDAO {
    public SomeCdiDAO() {
        System.out.println("SomeCdiDAO Constructor");
    }

    public int[] getData() {
        return new int[] {1, 5, 99};
    }
}
