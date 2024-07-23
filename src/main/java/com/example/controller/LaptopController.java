package com.example.controller;


import com.example.entity.Laptop;
import com.example.entity.Student;
import com.example.payload.LaptopStudentDto;
import com.example.service.LaptopService;
import com.example.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/laptop")
public class LaptopController {

    private final LaptopService laptopService;
    private final StudentService studentService;

    public LaptopController(LaptopService laptopService, StudentService studentService) {
        this.laptopService = laptopService;
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Laptop> addLaptop(@RequestBody LaptopStudentDto laptopStudentDTO) {
        Laptop laptop = laptopStudentDTO.getLaptop();
        Student student = laptopStudentDTO.getStudent();
        student = studentService.add(student); // Assuming there's an add method in StudentService
        laptop.setStudent(student);
        Laptop addedLaptop = laptopService.add(laptop);
        return new ResponseEntity<>(addedLaptop, HttpStatus.CREATED);
    }
}