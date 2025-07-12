// Define o pacote onde a classe está localizada
package com.victor.model;

// Importa as anotações da JPA para mapear a classe como entidade no banco de dados
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; // <- Identifica a chave primária da entidade

// Importa a anotação @Data do Lombok, que gera automaticamente getters, setters, equals, hashCode e toString
import lombok.Data;

// Anotação do Lombok que gera automaticamente os métodos getters, setters, toString, etc.
@Data

// Indica que essa classe é uma entidade JPA (vai virar uma tabela no banco de dados)
@Entity
public class Course {

    // Define o campo 'id' como chave primária da tabela
    @Id
    // Indica que o valor do ID será gerado automaticamente
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Define a coluna 'name' com no máximo 200 caracteres e que não pode ser nula
    @Column(length = 200, nullable = false)
    private String name;

    // Define a coluna 'category' com no máximo 200 caracteres e que também não pode ser nula
    @Column(length = 200, nullable = false)
    private String category;
}
