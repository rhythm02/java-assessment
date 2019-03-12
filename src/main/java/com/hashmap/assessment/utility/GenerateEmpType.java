package com.hashmap.assessment.utility;

import com.hashmap.assessment.model.EmpType;

import java.util.Date;

public class GenerateEmpType {
    public static EmpType calcEmpType(Date DOJ){
        EmpType empType = EmpType.PROBATION;
        Date today = new Date();
        long noOfDays = FindDays.calcNoOfDays(DOJ, today);

        if(noOfDays > 180 && DOJ.getYear() <= today.getYear()) {
            empType = EmpType.PERMANENT;
        }
        return empType;
    }
}
