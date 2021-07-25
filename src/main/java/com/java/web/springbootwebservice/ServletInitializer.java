package com.java.web.springbootwebservice;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		System.out.println("Inside ServletInitializer ..");
		return application.sources(SpringbootDeviceserviceApplication.class);
	}

}
