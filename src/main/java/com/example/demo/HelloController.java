package com.example.demo;


import com.example.demo.model.SchoolClass;
import com.example.demo.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ClassRepository classRepository;

    @GetMapping("/hello")
    public String hello()
    {
        return "<h1> Hello </h1>";
    }

    @PostMapping("/class")
    public String addClass()
    {
        String name = "class1";
        Integer id = 1;

        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setId(id);
        schoolClass.setClassName(name);

        classRepository.save(schoolClass);

        return "ok";
    }

}
