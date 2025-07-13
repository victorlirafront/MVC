package com.victor;

import com.victor.model.Course;
import com.victor.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	//o codigo abaixo é apenas para exemplo, isso nao iria para produção : )
	// Executa esse método ao iniciar a aplicação para popular o banco com dados de exemplo
	//No seu exemplo, o @Bean é usado para criar um CommandLineRunner, que roda automaticamente ao iniciar a aplicação. Isso é útil para:
	//Rodar código de inicialização (como popular o banco).
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository){
		return args -> {

			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end test");

			courseRepository.save(c);
		};
	}

}
