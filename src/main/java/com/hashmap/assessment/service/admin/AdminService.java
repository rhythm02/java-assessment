package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.employee.Employee;

import java.util.Date;
import java.util.UUID;

public interface AdminService {
    void addEmp(Employee emp);
    void removeEmp(UUID uuid);
    void addHoliday(Admin admin, Date holiday, String fest);
    void removeHoliday(Admin admin, Date holiday);
}
