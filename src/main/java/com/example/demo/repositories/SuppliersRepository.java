package com.example.demo.repositories;

import com.example.demo.entities.SuppliersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuppliersRepository extends JpaRepository<SuppliersEntity, Integer>{

}
