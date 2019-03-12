package com.hashmap.assessment.service.Holiday;

import com.hashmap.assessment.model.Admin;
import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.User;
import com.hashmap.assessment.service.DatabaseService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ManageHolidaysImp implements ManageHolidays {
    private Database database = DatabaseService.getInstance().getDatabase();

    @Override
    public void addHoliday(Admin admin, Date holiday, String fest ) {
       /* if(!database.getHolidayList().contains(holiday)){
            database.getHolidayList().add(holiday);
        }*/
       if(!database.getHolidayList().containsKey(holiday)) {
           database.getHolidayList().put(holiday, fest);
       }
    }

    @Override
    public void removeHoliday(Admin admin, Date holiday) {
        database.getHolidayList().remove(holiday);
    }

    @Override
    public Map<Date, String> viewHolidayYearly(User user, int year) {
        /*for (Date date:database.getHolidayList()) {
            if(date.getYear() == year) {
                System.out.println(date);
            }
        }*/
        for (Date d:database.getHolidayList().keySet()) {
            if(d.getYear() == year) {
                database.getYearlyHolidayList().put(d, database.getHolidayList().get(d));
            }
        }
        return database.getYearlyHolidayList();
    }

    @Override
    public Map<Date, String> viewHolidayMonthly(User user, int month) {
        for (Date d:database.getHolidayList().keySet()) {
            if(d.getMonth() == month) {
                database.getMonthlyHolidayList().put(d, database.getHolidayList().get(d));
            }
        }
        return database.getMonthlyHolidayList();
    }
}
