package com.example.demo.repository;


import com.example.demo.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<SchoolClass, Integer> {
}
