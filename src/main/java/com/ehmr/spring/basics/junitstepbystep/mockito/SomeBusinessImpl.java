package com.ehmr.spring.basics.junitstepbystep.mockito;

import com.ehmr.spring.basics.junitstepbystep.mockito.dao.DataService;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    int findGreatesFromAllData() throws Exception {
        int[] data = dataService.retrieveAllData();
        if(data.length == 0) throw new Exception("Data not found on service");

        int greatest = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }

        return greatest;
    }
}
