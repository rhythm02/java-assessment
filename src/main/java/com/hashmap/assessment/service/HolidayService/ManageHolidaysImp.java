package com.hashmap.assessment.service.HolidayService;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.DatabaseService;

import java.util.Date;

public class ManageHolidaysImp implements ManageHolidays {
    private Database database = DatabaseService.getInstance().getDatabase();

    @Override
    public void addHoliday(Admin admin, Date holiday) {
        if(!database.getHolidayList().contains(holiday)){
            database.getHolidayList().add(holiday);
        }
    }

    @Override
    public void removeHoliday(Admin admin, Date holiday) {
        database.getHolidayList().remove(holiday);
    }

    @Override
    public void viewHolidayYearly(User user, int year) {

    }

    @Override
    public void viewHolidayMonthly(User user, int month) {

    }
}
