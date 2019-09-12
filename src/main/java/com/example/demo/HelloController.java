package com.example.demo;


import com.example.demo.model.SchoolClass;
import com.example.demo.model.Student;
import com.example.demo.repository.ClassRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    ClassRepository classRepository;

    @Autowired
    StudentRepository studentRepository;

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

    @PostMapping("/student")
    public String addStudent(@RequestParam("id") Integer id, @RequestParam("name") String name)
    {
        Student student = new Student();

        student.setId(id);

        student.setName(name);

        studentRepository.save(student);

        return "ok";
    }

}
