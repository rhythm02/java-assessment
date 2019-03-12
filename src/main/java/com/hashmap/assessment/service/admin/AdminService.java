package com.hashmap.assessment.service.admin;

import com.hashmap.assessment.model.User;

import java.util.Date;
import java.util.UUID;

public interface AdminService {
    void addEmp(User emp);
    void removeEmp(UUID uuid);
    void addHoliday(Date holiday, String fest);
    void removeHoliday(Date holiday);
}
