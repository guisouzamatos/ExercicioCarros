package com.api.exe2;

import com.api.exe2.models.CarroModel;
import com.api.exe2.models.CategoriaModel;
import com.api.exe2.models.MarcaModel;
import com.api.exe2.repositories.CarroModelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exe2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exe2Application.class, args);
	}

}

