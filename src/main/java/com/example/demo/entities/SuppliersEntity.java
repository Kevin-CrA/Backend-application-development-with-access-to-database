package com.example.demo.entities;

import javax.persistence.*;

@Entity

public class SuppliersEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "suppliers_seq_gen")
    @SequenceGenerator(name="suppliers_seq_gen", sequenceName="suppliers_id_seq", allocationSize=1)

    @Column(name="id")
    private Integer id;
    @Column(name="brand", columnDefinition="varchar(20)", nullable=false)
    private String brand;
    @Column(name="contact_name", columnDefinition="varchar(60)", nullable=false)
    private String contactName;



    public SuppliersEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
