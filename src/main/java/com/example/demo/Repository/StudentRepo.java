package com.example.demo.Repository;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
// import org.springframework.data.jpa.repository;
// import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}