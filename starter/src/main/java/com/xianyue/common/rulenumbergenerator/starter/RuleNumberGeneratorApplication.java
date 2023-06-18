package com.xianyue.common.rulenumbergenerator.starter;

import jakarta.persistence.EntityManagerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * JPAConfig写在com.xianyue.common.rulenumbergenerator.infrastructure.config是无法正常工作的 FIXME
 *
 */
@Slf4j
@EnableTransactionManagement
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.xianyue", transactionManagerRef = "jpaTransactionManager")
@SpringBootApplication(scanBasePackages = "com.xianyue")
public class RuleNumberGeneratorApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(RuleNumberGeneratorApplication.class, args);
		log.info("Spring boot启动初始化了 {} 个 Bean", applicationContext.getBeanDefinitionNames().length);
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		HibernateJpaVendorAdapter japVendor = new HibernateJpaVendorAdapter();
		japVendor.setGenerateDdl(false);
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setJpaVendorAdapter(japVendor);
		// 与 @EntityScan(basePackages = {"com.xianyue.common.rulenumbergenerator.domain.*.entity"}) 都是用来扫描实体的
		entityManagerFactory.setPackagesToScan("com.xianyue.common.rulenumbergenerator.domain.**.entity");
		return entityManagerFactory;
	}

	@Bean
	public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
}
