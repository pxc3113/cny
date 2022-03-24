package com.ytc.app6;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.ytc.app6.dao"})
@SpringBootApplication
public class App6Application {

	public static void main(String[] args) {
		SpringApplication.run(App6Application.class, args);
	}
}
