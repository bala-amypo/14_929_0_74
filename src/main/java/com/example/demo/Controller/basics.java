package com.example.demo.Controller;
import org.springframework.bind.anootation
@RestController
public class basics {
    @GetMapping("/home")    
    public String name(){
        return "hello world";
    }
}
