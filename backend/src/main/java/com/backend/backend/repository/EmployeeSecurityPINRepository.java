package com.backend.backend.repository;

import com.backend.backend.entity.EmployeeSecurityPIN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSecurityPINRepository extends JpaRepository<EmployeeSecurityPIN, Integer> {
    EmployeeSecurityPIN findByEmployeeId(Integer employeeId);
}
