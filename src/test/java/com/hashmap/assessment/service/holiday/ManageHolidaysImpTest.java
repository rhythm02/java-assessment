package com.hashmap.assessment.service.holiday;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.employee.EmpRole;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.service.admin.AdminServiceImp;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ManageHolidaysImpTest {
    private Admin admin;
    private Employee medha;
  //  private Database database = DatabaseService.getInstance().getDatabase();

    @Before
    public void init() {
        AdminServiceImp adminServiceImp = new AdminServiceImp(admin);
        admin = new Admin("David", "david@email.com", new Date("02/01/2019"), EmpRole.ADMIN);
        medha = new Employee("Medha","medha@gmail.com", new Date("04/08/2016"), EmpRole.NON_ADMIN);

        adminServiceImp.addHoliday(admin, new Date(2019, 0,26), "Republic Day");
        adminServiceImp.addHoliday(admin, new Date(2019,2,4), "Holi");
        adminServiceImp.addHoliday(admin, new Date(2018,10,25), "Christmas");
        adminServiceImp.addHoliday(admin, new Date(2018,2,8), "Shivratri");
        adminServiceImp.addHoliday(admin, new Date(2018,9,11), "Diwali");
        adminServiceImp.addHoliday(admin, new Date(2019,9,20), "Dussehra");
        adminServiceImp.addHoliday(admin, new Date(2019,11,25), "Christmas");
    }

    @Test
    public void viewHolidayYearlyTest() {
        Map<Date, String> map;
        map = new ManageHolidaysImp().viewHolidayYearly(admin, 2019);
        for (HashMap.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }

    @Test
    public void viewHolidayMonthlyTest() {
        Map<Date, String> map;
        int month = 11;
        System.out.println(new Date(2019, 0,26));
        map = new ManageHolidaysImp().viewHolidayMonthly(medha,month-1);
        for (HashMap.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
    }
}