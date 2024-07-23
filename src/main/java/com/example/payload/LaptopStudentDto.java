package com.example.payload;

import com.example.entity.Laptop;
import com.example.entity.Student;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaptopStudentDto {
    private Laptop laptop;
    private Student student;
}
