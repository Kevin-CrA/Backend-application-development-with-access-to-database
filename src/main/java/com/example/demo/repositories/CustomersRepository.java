package com.example.demo.repositories;

import com.example.demo.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<CustomersEntity, Integer>{

}
