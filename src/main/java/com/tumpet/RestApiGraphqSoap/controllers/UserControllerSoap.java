package com.tumpet.RestApiGraphqSoap.controllers;

import com.tumpet.RestApiGraphqSoap.service.UserSoapService;
import com.tumpet.RestApiGraphqSoap.service.UserSoapServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration

public class UserControllerSoap {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public Bus bus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(Bus bus, UserSoapServiceImpl userSoapService) {
        EndpointImpl endpoint = new EndpointImpl(bus, userSoapService);
        endpoint.publish("/users");
        return endpoint;
    }
}
