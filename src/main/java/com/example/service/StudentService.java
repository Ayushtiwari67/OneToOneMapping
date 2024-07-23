package com.example.service;

import com.example.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public Student add(Student student);
}
