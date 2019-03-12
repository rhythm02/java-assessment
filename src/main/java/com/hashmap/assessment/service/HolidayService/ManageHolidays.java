package com.hashmap.assessment.service.HolidayService;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.User;

import java.util.Date;

public interface ManageHolidays {
    void addHoliday(Admin admin, Date holiday);
    void removeHoliday(Admin admin, Date holiday);
    void viewHolidayYearly(User user, int year);
    void viewHolidayMonthly(User user, int month);
}
