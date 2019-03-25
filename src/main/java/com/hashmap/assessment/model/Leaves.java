package com.hashmap.assessment.model;

import com.hashmap.assessment.model.employee.EmpType;
import com.hashmap.assessment.model.employee.Employee;
import lombok.Data;
import lombok.Getter;

@Data
public class Leaves {
    private int sickLeave = 0;
    private int casualLeave = 0;
    private int privilegeLeave = 0;
    private int totalLeaves = 0;

    public Leaves(EmpType empType) {
        if(empType == EmpType.PERMANENT) {
            sickLeave = 5;
            casualLeave = 5;
            privilegeLeave = 15;
            totalLeaves = sickLeave + casualLeave + privilegeLeave;
        }
    }
}
