package com.hashmap.assessment.model;

import com.hashmap.assessment.model.employee.Employee;
import lombok.Getter;

import java.util.*;

@Getter
public class Database {
    private List<Employee> empList;
    private List<Employee> admins;
    private Map<Date, String> holidayList;
    private Map<Date, String> yearlyHolidayList;
    private Map<Date, String> monthlyHolidayList;
    private Map<Employee, Map<LeaveType, Integer>> remainingLeaves;

    public Database() {
        empList = new ArrayList<>();
        admins = new ArrayList<>();
        holidayList = new HashMap<>();
        yearlyHolidayList = new HashMap<>();
        monthlyHolidayList = new HashMap<>();
        remainingLeaves = new HashMap<>();
    }
}
