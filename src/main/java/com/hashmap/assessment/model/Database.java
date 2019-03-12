package com.hashmap.assessment.model;

import lombok.Getter;

import java.util.*;

@Getter
public class Database {
    private List<User> empList;
    private List<User> admins;
    private Map<Date, String> holidayList;
    private Map<Date, String> yearlyHolidayList;
    private Map<Date, String> monthlyHolidayList;

    public Database() {
        empList = new ArrayList<>();
        admins = new ArrayList<>();
        holidayList = new HashMap<>();
        yearlyHolidayList = new HashMap<>();
        monthlyHolidayList = new HashMap<>();
    }
}
