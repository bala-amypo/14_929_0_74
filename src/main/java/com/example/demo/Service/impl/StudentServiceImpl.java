package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService { 


@Autowired StudentRepo repo;

@Override
 public StudentEntity postdata(StudentEntity stu){
   return repo.save(stu);
 }
 @Override
    public List<StudentEntity> getdata(){
     return repo.findAll();
    }
    @Override
   public  StudentEntity updatedata(int id,StudentEntity std){
     if(repo.existsById(id)){
        std.setId(id);
        return repo.save(std);

     }
     return null;

    }
    @Override
   public  String deletedata(int id){
    repo.deleteById(id);
    return "Deleted Sucessfully";

    }


    
}
