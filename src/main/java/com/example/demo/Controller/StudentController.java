package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentEntity;

import com.example.demo.Service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class StudentController {
    @Autowired StudentService std;


    @PostMapping("/post")
    public StudentEntity postMethodName(@RequestBody StudentEntity stu) {
        return std.postdata(stu);
    }
    @GetMapping("/get")
    public List<StudentEntity> getMethodName() {
        
        return std.getdata();
    }
    @PutMapping("put/{id}")
    public StudentEntity putMethodName(@PathVariable int id, @RequestBody StudentEntity entity) {
        return std.updatedata(id, entity);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return std.deletedata(id);
    }
    

    
}
