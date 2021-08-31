package com.example.StrudentCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StrudentCrud.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
