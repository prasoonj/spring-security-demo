package com.snortingcode.springsecuritydemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.snortingcode.springsecuritydemo.home.HomeComponentsScanable;

@Configuration
@ComponentScan(basePackageClasses = { HomeComponentsScanable.class })
public class ApplicationConfiguration {

}
