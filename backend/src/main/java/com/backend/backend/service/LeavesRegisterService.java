package com.backend.backend.service;

import com.backend.backend.entity.LeavesRegister;
import com.backend.backend.repository.LeavesRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeavesRegisterService {

    @Autowired
    private LeavesRegisterRepository leavesRegisterRepository;

    public LeavesRegister saveLeave(LeavesRegister leave) {
        return leavesRegisterRepository.save(leave);
    }

    public List<LeavesRegister> getLeavesByEmployeeId(Integer employeeId) {
        return leavesRegisterRepository.findByEmployeeId(employeeId);
    }
}
