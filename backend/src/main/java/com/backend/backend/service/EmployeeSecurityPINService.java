package com.backend.backend.service;

import com.backend.backend.entity.EmployeeSecurityPIN;
import com.backend.backend.repository.EmployeeSecurityPINRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeSecurityPINService {

    @Autowired
    private EmployeeSecurityPINRepository securityPINRepository;

    public EmployeeSecurityPIN saveSecurityPIN(EmployeeSecurityPIN securityPIN) {
        return securityPINRepository.save(securityPIN);
    }

    public EmployeeSecurityPIN getSecurityPINByEmployeeId(Integer employeeId) {
        return securityPINRepository.findByEmployeeId(employeeId);
    }
}
