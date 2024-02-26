package com.example.springdatajpaasociaciones.model;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 300)
    private String name;

    private Integer age;

    private Boolean married;

    private Double salary;

    private Instant createdDate;

    private LocalDate birthDate;

    private LocalDateTime RegistrationDate;

    private LocalTime startTime;

    @ElementCollection
    private List<String> email = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private EmployeeCategory category;

    @OneToOne
    @JoinColumn(name = "id_address",foreignKey = @ForeignKey(name = "FK_EMPLOYEE_ADDRESS"))
    private Address address;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
