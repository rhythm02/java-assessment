package com.hashmap.assessment.model;

import java.util.Date;
import java.util.UUID;

import static java.lang.Math.abs;

public class User {
    private char[] empName = new char[50];
    private UUID uuid;
    private  String email;
    private Date DOJ;
    private EmpRole empRole;
    private EmpType empType;

    public User(String empName, String email, Date DOJ, EmpRole empRole){
        this.empName = empName.toCharArray();
        this.email = email;
        this.DOJ = DOJ;
        this.empRole = empRole;
        this.uuid = UUID.randomUUID();
        empType = calcEmpType(DOJ);
    }

    public EmpType calcEmpType(Date DOJ){
        EmpType empType = EmpType.PROBATION;
        Date today = new Date();
        if(today.getYear() > DOJ.getYear() &&  abs(today.getMonth() - DOJ.getMonth()) >= 6) {
            System.out.println(today.getMonth());
            empType = EmpType.PERMANENT;
        }
        return empType;
    }
}
