package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource( locations={ "classpath:application-context.xml", "classpath:bootstrp-context.xml" } )
public class ServiceImplApplication {

	public static void main(String[] args) {

		SpringApplication.run( ServiceImplApplication.class, args );
	}
}
