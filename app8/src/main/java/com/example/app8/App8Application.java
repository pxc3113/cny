package com.example.app8;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.example.app8.dao"})
@SpringBootApplication
public class App8Application {

	public static void main(String[] args) {
		SpringApplication.run(App8Application.class, args);
	}

}
