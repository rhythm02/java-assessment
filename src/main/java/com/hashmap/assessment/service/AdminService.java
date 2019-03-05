package com.hashmap.assessment.service;

import com.hashmap.assessment.model.User;

import java.util.Date;

public interface AdminService {
    void addEmp(User emp);
    void removeEmp(User emp);
    void addHoliday(Date holiday);
}
