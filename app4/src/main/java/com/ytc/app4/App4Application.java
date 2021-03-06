package com.ytc.app4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.ytc.app4.dao"})
@SpringBootApplication
public class App4Application {

	public static void main(String[] args) {
		SpringApplication.run(App4Application.class, args);
	}
}
