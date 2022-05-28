package com.example.demo.entities;

import javax.persistence.*;

@Entity

public class CustomersEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "customers_seq_gen")
    @SequenceGenerator(name="customers_seq_gen", sequenceName="customers_id_seq", allocationSize=1)

    @Column(name="id")
    private Integer id;
    @Column(name="name", columnDefinition="varchar(20)", nullable=false)
    private String name;

    public CustomersEntity(){

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
}
