package com.hashmap.assessment.service;

import com.hashmap.assessment.model.User;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImp implements AdminService{
    List<User> empList;

    AdminServiceImp(){
        empList = new ArrayList<>();
    }

    @Override
    public void addEmp(User emp) {
        empList.add(emp);
    }

    @Override
    public void remove(User emp) {
        empList.remove(emp);
    }

    @Override
    public void addHoliday() {

    }
}
