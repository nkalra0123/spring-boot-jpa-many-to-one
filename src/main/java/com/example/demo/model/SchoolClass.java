package com.example.demo.model;

import javax.persistence.*;

@Entity
public class SchoolClass{

    @Id
    Integer classId;
    String className;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
