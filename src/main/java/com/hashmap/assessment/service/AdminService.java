package com.hashmap.assessment.service;

import com.hashmap.assessment.model.User;

public interface AdminService {
    void addEmp(User emp);
    void remove(User emp);
    void addHoliday();
}
