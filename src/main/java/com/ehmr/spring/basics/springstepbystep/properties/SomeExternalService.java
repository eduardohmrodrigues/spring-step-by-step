package com.ehmr.spring.basics.springstepbystep.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String getServiceEndpoint() {
        return url;
    }
}
