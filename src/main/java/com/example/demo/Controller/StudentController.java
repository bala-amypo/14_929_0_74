package com.example.sql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.sql.Entitydata.Student;
import com.example.sql.Service.StudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class StudentController {
    @Autowired StudentService std;


    @PostMapping("/post")
    public Student postMethodName(@RequestBody Student stu) {
        return std.postdata(stu);
    }
    @GetMapping("/get")
    public List<Student> getMethodName() {
        
        return std.getdata();
    }
    @PutMapping("put/{id}")
    public Student putMethodName(@PathVariable int id, @RequestBody Student entity) {
        return std.updatedata(id, entity);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return std.deletedata(id);
    }
    

    
}
