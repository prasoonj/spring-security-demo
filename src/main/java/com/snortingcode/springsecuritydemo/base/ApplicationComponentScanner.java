package com.snortingcode.springsecuritydemo.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.snortingcode.springsecuritydemo.config.ConfigComponentScanable;
import com.snortingcode.springsecuritydemo.home.HomeComponentsScanable;

@Component
@ComponentScan(basePackageClasses={HomeComponentsScanable.class,ConfigComponentScanable.class})
public class ApplicationComponentScanner {

}
