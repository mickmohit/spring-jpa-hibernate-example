package com.example.springjpahibernateexample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.example.springjpahibernateexample.repo")
@Configuration
public class JpaConfig {

	
	
}
