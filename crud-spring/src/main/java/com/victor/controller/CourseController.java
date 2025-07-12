// Define o pacote onde a classe está localizada
package com.victor.controller;

// Importa a entidade Course
import com.victor.model.Course;

// Importa o repositório que será usado para acessar o banco de dados
import com.victor.repository.CourseRepository;

// Importa a anotação do Lombok que gera um construtor com todos os argumentos (não está sendo usada no momento)
import lombok.AllArgsConstructor;

// Indica que essa classe é um controller REST (responde com JSON, por exemplo)
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Define que esta classe é um controller REST do Spring
@RestController

// Define o prefixo dos endpoints desta classe (ex: http://localhost:8080/api/courses)
@RequestMapping("/api/courses")
public class CourseController {

    // Declara uma variável para acessar o repositório de cursos
    private final CourseRepository courseRepository;

    // Injeta o CourseRepository via construtor
    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Define o endpoint GET /api/courses
    @GetMapping
    public List<Course> list() {
        // Retorna todos os cursos salvos no banco de dados
        return courseRepository.findAll();
    }
}
