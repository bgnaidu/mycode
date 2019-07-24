package com.walmart.rest.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class RestService implements EmbeddedServletContainerCustomizer {
	 @Override
	    public void customize(ConfigurableEmbeddedServletContainer container) {
	 
	        container.setPort(9000);
	    }
	public static void main(String[] args) {
		SpringApplication.run(RestService.class,args);
	}

}