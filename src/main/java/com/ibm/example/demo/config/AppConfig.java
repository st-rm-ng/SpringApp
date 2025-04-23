package com.ibm.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * Configuration of the microservice, e.g. messages
 */
@Configuration
@ComponentScan("com.ibm")
@EnableScheduling
@EnableConfigurationProperties
@ConfigurationProperties("app.config")
@Getter
@Setter
public class AppConfig {

}
