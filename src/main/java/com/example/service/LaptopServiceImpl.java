package com.example.service;

import com.example.entity.Laptop;
import com.example.repository.LaptopRepository;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService{
    private LaptopRepository laptopRepository;
    @Override
    public Laptop add(Laptop laptop) {
        Laptop save = laptopRepository.save(laptop);
        return save;
    }
}
