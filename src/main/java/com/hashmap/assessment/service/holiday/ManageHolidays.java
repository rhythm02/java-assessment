package com.hashmap.assessment.service.holiday;

import com.hashmap.assessment.model.employee.Employee;

import java.util.Date;
import java.util.Map;

public interface ManageHolidays {
    Map<Date, String> viewHolidayYearly(Employee employee, int year);
    Map<Date, String> viewHolidayMonthly(Employee employee, int month);
}
