package com.backend.backend.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSecurityPIN {

    @Id
    @GeneratedValue
    private Integer Id;

    private Integer PIN;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false, unique = true) // Unique ensures one-to-one
    private Employee employee;
}
