package com.hashmap.assessment.utility;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

public class FindDays {
    public static long calcNoOfDays(Date startDate, Date endDate) {
        long diff = abs(startDate.getTime() - endDate.getTime());
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
}
