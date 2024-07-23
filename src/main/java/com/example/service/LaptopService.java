package com.example.service;

import com.example.entity.Laptop;
import org.springframework.stereotype.Service;

@Service
public interface LaptopService {
    public Laptop add(Laptop laptop);
}
