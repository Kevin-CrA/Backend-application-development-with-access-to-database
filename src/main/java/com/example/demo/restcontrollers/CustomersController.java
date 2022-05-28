package com.example.demo.restcontrollers;

import com.example.demo.entities.CustomersEntity;
import com.example.demo.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio CustomersService
 */


@RestController
@RequestMapping("/customers")

public class CustomersController {

    @Autowired
    private CustomersService customersService;

    @GetMapping()
    public List<CustomersEntity>find(){return customersService.find();}

}
