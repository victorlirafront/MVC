// Define o pacote onde a interface está localizada
package com.victor.repository;

// Importa a classe Course, que representa a entidade do banco de dados
import com.victor.model.Course;

// Importa a interface JpaRepository que oferece métodos prontos para acesso ao banco de dados
import org.springframework.data.jpa.repository.JpaRepository;

// Importa a anotação @Repository para indicar que essa interface é um repositório Spring
import org.springframework.stereotype.Repository;

// Indica que essa interface é um componente de repositório do Spring (responsável por acesso a dados)
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // A interface estende JpaRepository e herda métodos como:
    // - findAll()
    // - findById(Long id)
    // - save(Course course)
    // - delete(Course course)
    // Você pode adicionar métodos personalizados aqui se necessário, como:
    // List<Course> findByTitle(String title);
}
