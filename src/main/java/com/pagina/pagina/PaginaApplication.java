package com.pagina.pagina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaginaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginaApplication.class, args);
	}

}
