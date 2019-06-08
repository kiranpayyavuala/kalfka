package com.companyname.ApacheKafkaExample;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.companyname.ApacheKafkaExample"})
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping(value="/getUsernameAndPassword",method = RequestMethod.GET)
	String getUsernameAndPassword(@RequestParam String username,@RequestParam String password) {
		return username+password;
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}