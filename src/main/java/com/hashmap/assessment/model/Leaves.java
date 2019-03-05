package com.hashmap.assessment.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Leaves {
    private int sickLeave = 0;
    private int casualLeave = 0;
    private int privelegeLeave = 0;
    private int totalLeaves = 0;

    public int calcTotalLeaves(User user) {
        if(user.getEmpType() == EmpType.PERMANENT) {
            sickLeave = 5;
            casualLeave = 5;
            privelegeLeave = 15;
            totalLeaves = sickLeave + casualLeave + privelegeLeave;
            return totalLeaves;
        }
        return totalLeaves;
    }

    public void applyLeave() {

    }
}
