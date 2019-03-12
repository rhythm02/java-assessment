package com.hashmap.assessment.model;

import com.hashmap.assessment.Exception.EmailException;
import com.hashmap.assessment.Exception.NameException;
import com.hashmap.assessment.utility.GenerateEmpType;
import com.hashmap.assessment.utility.ValidateEmail;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class User {
    private char[] empName = new char[50];
    private UUID uuid;
    private String email;
    private Date DOJ;
    private EmpRole empRole;
    private EmpType empType;
    private Leaves leaves;

    public User(String empName, String email, Date DOJ, EmpRole empRole){

        if (empName.length() > 50) {
            throw new NameException("Length of the name exceeding 50 characters.");
        }
        else {
            this.empName = empName.toCharArray();
        }

        if (ValidateEmail.isValid(email)) {
            this.email = email;
        }
        else {
            throw new EmailException("Please give a valid Email.");
        }

        this.DOJ = DOJ;
        this.empRole = empRole;
        this.uuid = UUID.randomUUID();
        empType = GenerateEmpType.calcEmpType(DOJ);

        leaves =new Leaves();
    }
}
