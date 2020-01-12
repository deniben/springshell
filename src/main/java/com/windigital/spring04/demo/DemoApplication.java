package com.windigital.spring04.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		MyService myService = ctx.getBean(MyService.class);
		System.out.println(myService.getVersion());
	}

}
