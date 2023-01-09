package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController//@Controller + @ResponseBody 전에 했던 컨트롤러와 니스판스바디를 합친것을 임포트해준다 
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	@GetMapping(value = "/")
	public String HellowWorld() {
		return "Hellow world";
	}
	
}
