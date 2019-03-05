package com.hashmap.assessment.model;

import java.util.Date;
import java.util.UUID;

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
        empType = getEmpType(DOJ);
    }

    public EmpType getEmpType(Date DOJ){
        EmpType empType = EmpType.PROBATION;
        return empType;
    }
}
