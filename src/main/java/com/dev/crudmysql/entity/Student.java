package com.dev.crudmysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// Anotación de Lombok para generar automáticamente getters, setters, toString(), etc.
@Data
// Anotación de JPA para indicar que esta clase es una entidad
@Entity
// Anotación de JPA para especificar el nombre de la tabla en la base de datos
@Table(name="tbl_student")
public class Student {
    // Anotación de JPA para marcar el campo como clave primaria
    @Id
    // Anotación de JPA para especificar cómo se generará automáticamente el valor de la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    // Anotación de JPA para especificar el mapeo entre el campo y la columna en la base de datos
    // Además, indica que el valor de email debe ser único en la tabla
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;
}
