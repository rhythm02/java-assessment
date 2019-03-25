package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.*;
import com.hashmap.assessment.model.employee.EmpRole;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.service.DatabaseService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class AdminServiceTest {

    private AdminServiceImp adminServiceImp;
    private Admin admin;
    private Database database = DatabaseService.getInstance().getDatabase();

    @Before
    public void init(){
        adminServiceImp = new AdminServiceImp(admin);
        admin = new Admin("john", "john@email.com", new Date("02/01/2018"), EmpRole.ADMIN);
    }

    @Test
    public void addEmpTest() {
        Employee harry = new Employee("harufrry", "harry@email.com", new Date("06/16/2018"), EmpRole.NON_ADMIN);
        Employee kelly = new Employee("kelly", "kelly@email.com", new Date("01/15/2019"), EmpRole.NON_ADMIN);
        Employee chris = new Employee("chris", "chris@email.com", new Date("03/10/2017"), EmpRole.NON_ADMIN);
        Employee medha = new Employee("medha", "chris@email.com", new Date("03/10/2017"), EmpRole.NON_ADMIN);
        adminServiceImp.addEmp(medha);
        adminServiceImp.addEmp(harry);
        adminServiceImp.addEmp(kelly);
        adminServiceImp.addEmp(chris);

        Assert.assertNotNull(database.getEmpList());
        Assert.assertTrue(database.getEmpList().contains(medha));
    }

    @Test
    public void addHolidayTest() {
        adminServiceImp.addHoliday(admin, new Date("01/26/2019"), "Republic Day");
        adminServiceImp.addHoliday(admin, new Date("03/04/2019"), "Shivratri");
        adminServiceImp.addHoliday(admin, new Date("12/25/2018"), "Christmas");
        adminServiceImp.addHoliday(admin, new Date("03/21/2018"), "Holi");
        adminServiceImp.addHoliday(admin, new Date("11/10/2018"), "Diwali");
        adminServiceImp.addHoliday(admin, new Date("10/20/2018"), "Diwali");
        adminServiceImp.addHoliday(admin, new Date("12/25/2019"), "Christmas");
/*
        for (HashMap.Entry entry:database.getHolidayList().entrySet()
        ) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }*/

        Assert.assertNotNull(database.getHolidayList());
        Assert.assertTrue(database.getHolidayList().containsKey(new Date("12/25/2018")));
    }

    @Test
    public void removeEmpTest() {
        Employee ankush = new Employee("Ankush","iskiemail@gmail.com", new Date(),EmpRole.NON_ADMIN);
        adminServiceImp.removeEmp(ankush.getUuid());

        Assert.assertFalse(database.getEmpList().contains(ankush));
    }

}