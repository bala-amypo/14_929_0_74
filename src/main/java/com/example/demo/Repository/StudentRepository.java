package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.JpaRepository;
import com.example.demo.Entity.StudentEntity;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}