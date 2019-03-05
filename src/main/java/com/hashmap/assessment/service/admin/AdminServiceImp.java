package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.EmpList;
import com.hashmap.assessment.model.HolidayList;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.admin.AdminService;

import java.util.Date;

public class AdminServiceImp implements AdminService {
    private EmpList empList;
    private HolidayList holidayList;

    public AdminServiceImp(EmpList empList, HolidayList holidayList){
        this.empList = empList;
        this.holidayList = holidayList;
    }

    @Override
    public void addEmp(User emp) {
        empList.getEmpList().add(emp);
    }

    @Override
    public void removeEmp(User emp) {
        empList.getEmpList().remove(emp);
    }

    @Override
    public void addHoliday(Date holiday) {
        holidayList.getHolidayList().add(holiday);
    }
}