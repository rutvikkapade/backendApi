package com.consultadd.CRUD.repository;

import com.consultadd.CRUD.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
