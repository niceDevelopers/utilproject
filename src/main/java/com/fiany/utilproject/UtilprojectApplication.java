package com.fiany.utilproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fiany.utilproject.mapper")
public class UtilprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilprojectApplication.class, args);
	}
}
