package com.hashmap.assessment.service;

import com.hashmap.assessment.model.*;
import com.hashmap.assessment.service.admin.AdminServiceImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class AdminServiceTest {
    private EmpList empList;
    private HolidayList holidayList;
    private AdminServiceImp adminServiceImp;
    private User admin;

    @Before
    public void init(){
        empList = new EmpList();
        holidayList = new HolidayList();
        adminServiceImp = new AdminServiceImp(empList, holidayList);
        admin = new User("john", "john@email.com", new Date("02/01/2018"), EmpRole.ADMIN);

    }

    @Test
    public void addEmpTest(){
        User harry = new User("harry", "harry@email.com", new Date("06/16/2018"), EmpRole.NON_ADMIN);
        User kelly = new User("kelly", "kelly@email.com", new Date("01/15/2019"), EmpRole.NON_ADMIN);
        User chris = new User("chris", "chris@email.com", new Date("03/10/2017"), EmpRole.NON_ADMIN);

        adminServiceImp.addEmp(harry);
        adminServiceImp.addEmp(kelly);
        adminServiceImp.addEmp(chris);
    }

    @Test
    public void addHolidayTest() {
        adminServiceImp.addHoliday(new Date("01/26/2019"));
        adminServiceImp.addHoliday(new Date("03/04/2019"));
        adminServiceImp.addHoliday(new Date("12/25/2018"));
    }

}