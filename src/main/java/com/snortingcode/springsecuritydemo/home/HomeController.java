package com.snortingcode.springsecuritydemo.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home/")
public class HomeController {
	
	@RequestMapping("notSecure")
	public String notSecure(){
		return "This method is not secured!";
		
	}

}
