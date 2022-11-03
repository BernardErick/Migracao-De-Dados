package com.example.migracaodados;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class MigracaoDadosJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(MigracaoDadosJobApplication.class, args);
	}

}
