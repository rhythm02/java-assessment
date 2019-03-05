package com.hashmap.assessment.service.user;

import com.hashmap.assessment.model.HolidayList;
import com.hashmap.assessment.model.User;

import java.util.Date;

public interface UserService {
    void viewHolidays(HolidayList holidayList);
    int viewLeaves(User user);
    void applyLeaves(User user,Date startDate, Date endDate);
}
