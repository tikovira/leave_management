package com.backend.backend.controller;

import com.backend.backend.entity.LeavesRegister;
import com.backend.backend.service.LeavesRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")
public class LeavesRegisterController {

    @Autowired
    private LeavesRegisterService leavesRegisterService;

    @PostMapping
    public LeavesRegister createLeave(@RequestBody LeavesRegister leave) {
        return leavesRegisterService.saveLeave(leave);
    }

    @GetMapping("/employee/{employeeId}")
    public List<LeavesRegister> getLeavesByEmployee(@PathVariable Integer employeeId) {
        return leavesRegisterService.getLeavesByEmployeeId(employeeId);
    }
}
