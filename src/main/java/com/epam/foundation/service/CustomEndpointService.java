package com.epam.foundation.service;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpointService {

    @ReadOperation
    public String getOperation() {
        return "custom-end-point";
    }
}
