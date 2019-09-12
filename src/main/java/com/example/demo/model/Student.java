package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student  {

    @Id
    Integer id;
    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "className", referencedColumnName = "className")
    SchoolClass schoolClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
