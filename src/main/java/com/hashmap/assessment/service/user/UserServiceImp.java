package com.hashmap.assessment.service.user;

import com.hashmap.assessment.model.HolidayList;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.user.UserService;
import com.hashmap.assessment.utility.FindDays;

import java.util.Date;
import java.util.UUID;

public class UserServiceImp implements UserService {

    @Override
    public void viewHolidays(HolidayList holidayList) {
        for (Date d: holidayList.getHolidayList()) {
            System.out.println(d.toString());
        }
    }

    @Override
    public int viewLeaves(User user) {
       return user.getLeaves().calcTotalLeaves(user);
    }

    @Override
    public void applyLeaves(User user,Date startDate, Date endDate) {
        if(user.getLeaves().getTotalLeaves() != 0) {
            long noOfDays = FindDays.calcNoOfDays(startDate, endDate);
            user.getLeaves().applyLeave();
        }
    }
}
