package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "laptopName", nullable = false,length = 100)
    private String laptopName;
    @Column(name = "processor", nullable = false, length = 100)
    private String processor;

    @OneToOne()
    @JoinColumn(name = "student_id")
    private Student student;

}