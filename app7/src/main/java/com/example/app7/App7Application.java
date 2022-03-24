package com.example.app7;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.example.app7.dao"})
@SpringBootApplication
public class App7Application {

	public static void main(String[] args) {
		SpringApplication.run(App7Application.class, args);
	}

}
