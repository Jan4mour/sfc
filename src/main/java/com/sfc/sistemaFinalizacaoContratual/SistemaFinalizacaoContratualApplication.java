package com.sfc.sistemaFinalizacaoContratual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackages = "com.sfc.sistemaFinalizacaoContratual")
@SpringBootApplication
public class SistemaFinalizacaoContratualApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFinalizacaoContratualApplication.class, args);
	}
}
