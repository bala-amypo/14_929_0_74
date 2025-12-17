package com.example.demo.service;
import com.example.demo.entity.Student;
import java.util.List;
public interface StudentService {
Student saveStudent(Student student);
Student getStudentById(Integer id);
List<Student> getAllStudents();
Student updateStudent(Integer id, Student student);
void deleteStudent(Integer id);
}