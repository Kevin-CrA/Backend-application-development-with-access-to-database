package com.example.demo.services;

import com.example.demo.entities.SuppliersEntity;
import com.example.demo.repositories.SuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SuppliersService {

    @Autowired
    private SuppliersRepository suppliersRepository;


    public List<SuppliersEntity> find(){
        return suppliersRepository.findAll();
    }

}
