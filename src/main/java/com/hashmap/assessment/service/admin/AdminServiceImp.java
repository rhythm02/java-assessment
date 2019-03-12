package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.service.DatabaseService;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.HolidayService.ManageHolidays;
import com.hashmap.assessment.service.HolidayService.ManageHolidaysImp;

import java.util.Date;
import java.util.UUID;

public class AdminServiceImp implements AdminService {
    private Admin admin;
    private DatabaseService databaseService = DatabaseService.getInstance();

    public AdminServiceImp (Admin admin) { this.admin = admin; }

    @Override
    public void addEmp (User emp) { databaseService.getDatabase().getEmpList().add(emp); }

    @Override
    public void removeEmp (UUID uuid) {
        for (User emp : databaseService.getDatabase().getEmpList()) {
            if(emp.getUuid() == uuid) {
                databaseService.getDatabase().getEmpList().remove(emp);
            }
        }
    }

    @Override
    public void addHoliday (Date holiday) { new ManageHolidaysImp().addHoliday(admin, holiday); }

    @Override
    public void removeHoliday(Date holiday) { new ManageHolidaysImp().removeHoliday(admin, holiday); }
}
