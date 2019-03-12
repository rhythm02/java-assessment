package com.hashmap.assessment.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
public class Database {
    private List<User> empList;
    private List<User> admins;
    private List<Date> holidayList;

    public Database() {
        empList = new ArrayList<>();
        admins = new ArrayList<>();
        holidayList = new ArrayList<>();
    }
}
