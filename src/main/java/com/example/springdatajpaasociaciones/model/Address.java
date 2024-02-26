package com.example.springdatajpaasociaciones.model;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String postalCode;

    // bi-directional (Optional)
    @OneToOne(mappedBy = "address")
    private Employee employee;
}
