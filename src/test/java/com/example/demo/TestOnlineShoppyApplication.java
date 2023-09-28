package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestOnlineShoppyApplication {

	public static void main(String[] args) {
		SpringApplication.from(OnlineShoppyApplication::main).with(TestOnlineShoppyApplication.class).run(args);
	}

}
