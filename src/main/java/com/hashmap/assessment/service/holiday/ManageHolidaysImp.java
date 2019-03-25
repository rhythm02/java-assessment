package com.hashmap.assessment.service.holiday;

import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.service.DatabaseService;

import java.util.Date;
import java.util.Map;

public class ManageHolidaysImp implements ManageHolidays {
    private Database database = DatabaseService.getInstance().getDatabase();

    @Override
    public Map<Date, String> viewHolidayYearly(Employee employee, int year) {
        for (Date d:database.getHolidayList().keySet()) {
            if(d.getYear() == year) {
                database.getYearlyHolidayList().put(d, database.getHolidayList().get(d));
            }
        }
        return database.getYearlyHolidayList();
    }

    @Override
    public Map<Date, String> viewHolidayMonthly(Employee employee, int month) {
        for (Date d:database.getHolidayList().keySet()) {
            if(d.getMonth() == month) {
                database.getMonthlyHolidayList().put(d, database.getHolidayList().get(d));
            }
        }
        return database.getMonthlyHolidayList();
    }
}
