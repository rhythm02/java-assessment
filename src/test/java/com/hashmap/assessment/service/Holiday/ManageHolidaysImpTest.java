package com.hashmap.assessment.service.Holiday;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.EmpRole;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.DatabaseService;
import com.hashmap.assessment.service.admin.AdminServiceImp;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ManageHolidaysImpTest {
    private AdminServiceImp adminServiceImp;
    private Admin admin;
    private User medha;
    private Database database = DatabaseService.getInstance().getDatabase();

    @Before
    public void init() {
        adminServiceImp = new AdminServiceImp(admin);
        admin = new Admin("David", "david@email.com", new Date("02/01/2019"), EmpRole.ADMIN);
        medha = new User("Medha","medha@gmail.com", new Date("04/08/2016"), EmpRole.NON_ADMIN);

        adminServiceImp.addHoliday(new Date(2019, 0,26), "Republic Day");
        adminServiceImp.addHoliday(new Date(2019,2,4), "holi");
        adminServiceImp.addHoliday(new Date(2018,10,25), "Christmas");
        adminServiceImp.addHoliday(new Date(2018,2,8), "Shivratri");
        adminServiceImp.addHoliday(new Date(2018,9,11), "diwali");
        adminServiceImp.addHoliday(new Date(2019,9,20), "Dussehra");
        adminServiceImp.addHoliday(new Date(2019,11,25), "Christmas");
    }

    @Test
    public void viewHolidayYearlyTest() {
        Map<Date, String> map= new HashMap<>();
        map = new ManageHolidaysImp().viewHolidayYearly(medha, 2019);
        for (HashMap.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }

    @Test
    public void viewHolidayMonthlyTest() {
        Map<Date, String> map= new HashMap<>();
        int month = 11;
        map = new ManageHolidaysImp().viewHolidayMonthly(medha,month-1);
        for (HashMap.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }
}