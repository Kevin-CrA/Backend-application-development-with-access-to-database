package com.example.demo.restcontrollers;

import com.example.demo.entities.SuppliersEntity;
import com.example.demo.services.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Ejemplo de RestController
 * Se agrega el servicio SuppliersService
 */


@RestController
@RequestMapping("/suppliers")

public class SuppliersController {

    @Autowired
    private SuppliersService suppliersService;

    @GetMapping()
    public List<SuppliersEntity>find() {return suppliersService.find();}

}
