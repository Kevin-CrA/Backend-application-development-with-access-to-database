package com.example.demo.services;


import com.example.demo.entities.CustomersEntity;
import com.example.demo.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomersService {
    @Autowired
    private CustomersRepository customersRepository;
    public List<CustomersEntity> find(){return customersRepository.findAll();}
}
