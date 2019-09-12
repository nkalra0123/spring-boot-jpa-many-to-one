package com.example.demo;


import com.example.demo.model.SchoolClass;
import com.example.demo.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    ClassRepository classRepository;

    @GetMapping("/hello")
    public String hello()
    {
        return "<h1> Hello </h1>";
    }

    @PostMapping("/class/{id}/{name}")
    public String addClass(@PathVariable("id") Integer id, @PathVariable("name") String name)
    {
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setId(id);
        schoolClass.setClassName(name);

        classRepository.save(schoolClass);

        return "ok";
    }

}
