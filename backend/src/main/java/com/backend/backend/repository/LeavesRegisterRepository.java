package com.backend.backend.repository;

import com.backend.backend.entity.LeavesRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeavesRegisterRepository extends JpaRepository<LeavesRegister, Integer> {
    List<LeavesRegister> findByEmployeeId(Integer employeeId);
}
