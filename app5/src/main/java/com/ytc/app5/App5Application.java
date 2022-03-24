package com.ytc.app5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.ytc.app5.dao"})
@SpringBootApplication
public class App5Application {

	public static void main(String[] args) {
		SpringApplication.run(App5Application.class, args);
	}
}
