package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.service.DatabaseService;
import com.hashmap.assessment.model.employee.Employee;

import java.util.Date;
import java.util.UUID;

public class AdminServiceImp implements AdminService {
    private Admin admin;
    private Database database = DatabaseService.getInstance().getDatabase();


    public AdminServiceImp (Admin admin) { this.admin = admin; }

    @Override
    public void addEmp (Employee emp) { database.getEmpList().add(emp); }

    @Override
    public void removeEmp (UUID uuid) {
        for (Employee emp : database.getEmpList()) {
            if(emp.getUuid() == uuid) {
                database.getEmpList().remove(emp);
            }
        }
    }

    @Override
    public void addHoliday (Admin admin, Date holiday, String fest) {
        if(!database.getHolidayList().containsKey(holiday)) {
            database.getHolidayList().put(holiday, fest);
        }
    }

    @Override
    public void removeHoliday(Admin admin, Date holiday) {
        database.getHolidayList().remove(holiday);
    }
}
