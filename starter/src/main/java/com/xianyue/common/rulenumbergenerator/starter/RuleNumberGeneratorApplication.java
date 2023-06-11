package com.xianyue.common.rulenumbergenerator.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.xianyue")
public class RuleNumberGeneratorApplication {
     public static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(RuleNumberGeneratorApplication.class, args);

	}
}
