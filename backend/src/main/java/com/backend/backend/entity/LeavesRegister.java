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
public class LeavesRegister {

    @Id
    @GeneratedValue
    private Integer Id;

    private Date LeaveDate;

    private Integer NumberOfDays;

    private String LeaveType;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false) // Foreign key column in LeavesRegister table
    private Employee employee;
}
