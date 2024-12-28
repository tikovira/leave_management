package com.backend.backend.controller;

import com.backend.backend.entity.EmployeeSecurityPIN;
import com.backend.backend.service.EmployeeSecurityPINService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/security-pins")
public class EmployeeSecurityPINController {

    @Autowired
    private EmployeeSecurityPINService securityPINService;

    @PostMapping
    public EmployeeSecurityPIN createSecurityPIN(@RequestBody EmployeeSecurityPIN securityPIN) {
        return securityPINService.saveSecurityPIN(securityPIN);
    }

    @GetMapping("/employee/{employeeId}")
    public EmployeeSecurityPIN getSecurityPINByEmployeeId(@PathVariable Integer employeeId) {
        return securityPINService.getSecurityPINByEmployeeId(employeeId);
    }
}
