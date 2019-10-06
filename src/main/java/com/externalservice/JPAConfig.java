//package com.externalservice;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@EnableTransactionManagement
//public class JPAConfig {
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
//		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
//		entityManager.setDataSource(dataSource());
////		entityManager.setJpaVendorAdapter(jpaVendorAdapter);
//		return entityManager;
//	}
//	
//	@Bean
//	public DataSource dataSource() {
//		return new HikariDataSource(config());
//	}
//	
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public HikariConfig config() {
//		return new HikariConfig();
//	}
//	
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
//		return transactionManager;
//	}
//}
