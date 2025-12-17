package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.
import com.example.demo.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}