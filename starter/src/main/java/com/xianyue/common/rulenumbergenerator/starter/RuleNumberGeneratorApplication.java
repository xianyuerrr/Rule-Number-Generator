package com.xianyue.common.rulenumbergenerator.starter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@EntityScan(basePackages = {"com.xianyue"})
@EnableJpaRepositories(basePackages = "com.xianyue")
@SpringBootApplication(scanBasePackages = "com.xianyue")
public class RuleNumberGeneratorApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RuleNumberGeneratorApplication.class, args);
		log.info("Spring boot启动初始化了 {} 个 Bean", applicationContext.getBeanDefinitionNames().length);
	}
}
