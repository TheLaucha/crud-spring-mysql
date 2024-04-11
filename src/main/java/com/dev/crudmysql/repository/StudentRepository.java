package com.dev.crudmysql.repository;

import com.dev.crudmysql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Anotación que indica que esta interfaz es un componente de acceso a datos
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // No se requieren métodos adicionales aquí, JpaRepository proporciona métodos CRUD por defecto
}
