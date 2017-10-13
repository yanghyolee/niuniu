package com.btm.niuniu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.btm.niuniu.mapper"})
public class NiuniuApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiuniuApplication.class, args);
	}
}
