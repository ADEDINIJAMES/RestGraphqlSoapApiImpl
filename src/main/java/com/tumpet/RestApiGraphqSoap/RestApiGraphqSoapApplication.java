package com.tumpet.RestApiGraphqSoap;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.tumpet.RestApiGraphqSoap.service")
public class RestApiGraphqSoapApplication {
//@Bean(name=Bus.DEFAULT_BUS_ID)
//	public Bus bus(){
//		return new SpringBus();
//	}

	public static void main(String[] args) {
		SpringApplication.run(RestApiGraphqSoapApplication.class, args);
	}

}
