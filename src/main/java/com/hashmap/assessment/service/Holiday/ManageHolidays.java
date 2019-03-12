package com.hashmap.assessment.service.Holiday;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.User;

import java.util.Date;
import java.util.Map;

public interface ManageHolidays {
    void addHoliday(Admin admin, Date holiday, String fest);
    void removeHoliday(Admin admin, Date holiday);
    Map<Date, String> viewHolidayYearly(User user, int year);
    Map<Date, String> viewHolidayMonthly(User user, int month);
}
