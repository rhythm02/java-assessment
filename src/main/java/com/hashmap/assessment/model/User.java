package com.hashmap.assessment.model;

import com.hashmap.assessment.utility.FindDays;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.abs;

@Getter
public class User {
    private char[] empName = new char[50];
    private UUID uuid;
    private  String email;
    private Date DOJ;
    private EmpRole empRole;
    private EmpType empType;
    private Leaves leaves;

    public User(String empName, String email, Date DOJ, EmpRole empRole){
        this.empName = empName.toCharArray();
        this.email = email;
        this.DOJ = DOJ;
        this.empRole = empRole;
        this.uuid = UUID.randomUUID();
        empType = calcEmpType(DOJ);
        leaves =new Leaves();
    }

     private EmpType calcEmpType(Date DOJ){
        EmpType empType = EmpType.PROBATION;
        Date today = new Date();
         long noOfDays = FindDays.calcNoOfDays(DOJ, today);
         if(noOfDays > 180 && DOJ.getYear() <= today.getYear()) {
             empType = EmpType.PERMANENT;
         }
        return empType;
    }
}
