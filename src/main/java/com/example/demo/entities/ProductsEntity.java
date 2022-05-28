package com.example.demo.entities;

import javax.persistence.*;
import javax.persistence.GenerationType;

@Entity

public class ProductsEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "products_seq_gen")
    @SequenceGenerator(name="products_seq_gen", sequenceName="products_id_seq", allocationSize=1)

    @Column(name="id")
    private Integer id;

    @Column(name="name", columnDefinition="varchar(20)", nullable=false)
    private String name;

    @Column(name="brand", columnDefinition="varchar(60)", nullable=false)
    private String brand;


    public ProductsEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
