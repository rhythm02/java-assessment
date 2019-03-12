package com.hashmap.assessment.service;

import com.hashmap.assessment.model.*;
import com.hashmap.assessment.service.admin.AdminServiceImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class AdminServiceTest {

    DatabaseService databaseService = DatabaseService.getInstance();
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
        User harry = new User("harufrry", "harry@email.com", new Date("06/16/2018"), EmpRole.NON_ADMIN);
        User kelly = new User("kelly", "kelly@email.com", new Date("01/15/2019"), EmpRole.NON_ADMIN);
        User chris = new User("chris", "chris@email.com", new Date("03/10/2017"), EmpRole.NON_ADMIN);
        User medha = new User("medha", "chris@email.com", new Date("03/10/2017"), EmpRole.NON_ADMIN);
        adminServiceImp.addEmp(medha);
        adminServiceImp.addEmp(harry);
        adminServiceImp.addEmp(kelly);
        adminServiceImp.addEmp(chris);

        Assert.assertNotNull(database.getEmpList());
        Assert.assertTrue(database.getEmpList().contains(medha));
    }

    @Test
    public void addHolidayTest() {
        adminServiceImp.addHoliday(new Date("01/26/2019"));
        adminServiceImp.addHoliday(new Date("03/04/2019"));
        adminServiceImp.addHoliday(new Date("12/25/2018"));

        Assert.assertNotNull(database.getHolidayList());
        Assert.assertTrue(database.getHolidayList().contains(new Date("12/25/2018")));
    }

    @Test
    public void removeEmpTest() {
        User ankush = new User("Ankush","iskiemail@gmail.com", new Date(),EmpRole.NON_ADMIN);
        adminServiceImp.removeEmp(ankush.getUuid());

        Assert.assertFalse(database.getEmpList().contains(ankush));
    }

}