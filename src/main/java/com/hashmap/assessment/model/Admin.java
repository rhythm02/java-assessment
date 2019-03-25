package com.hashmap.assessment.model;

import com.hashmap.assessment.model.employee.EmpRole;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.service.DatabaseService;

import java.util.Date;

public class Admin extends Employee {


    public Admin(String empName, String email, Date DOJ, EmpRole empRole) {
        super(empName, email, DOJ, empRole);
        DatabaseService.getInstance().getDatabase().getAdmins().add(this);
    }
}
