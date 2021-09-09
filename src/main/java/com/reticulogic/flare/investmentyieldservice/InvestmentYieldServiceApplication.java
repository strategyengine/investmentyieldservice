package com.reticulogic.flare.investmentyieldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.log4j.Log4j2;

@Log4j2
@EnableScheduling
@SpringBootApplication
public class InvestmentYieldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentYieldServiceApplication.class, args);
	}

}
