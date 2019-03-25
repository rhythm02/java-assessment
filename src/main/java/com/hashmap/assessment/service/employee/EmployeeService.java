package com.hashmap.assessment.service.employee;

import com.hashmap.assessment.model.Request;
import com.hashmap.assessment.model.employee.Employee;

import java.util.Date;

public interface EmployeeService {
    int viewLeaves(Employee employee);
    void applyLeaves(Request request);
}
