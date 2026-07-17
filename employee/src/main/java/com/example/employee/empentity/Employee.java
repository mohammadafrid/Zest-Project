package com.example.employee.empentity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "department", nullable = false, length = 100)
    private String department;

    @Column(name = "position", nullable = false, length = 100)
    private String position;

    @Column(name = "salary", nullable = false)
    private Double salary;

    @Column(name = "dateofjoining", nullable = false)
    private LocalDate dateofjoining;

}