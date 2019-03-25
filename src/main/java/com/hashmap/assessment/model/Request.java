package com.hashmap.assessment.model;

import com.hashmap.assessment.model.employee.Employee;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class Request {
    private UUID empId;
    private Date startDate;
    private Date endDate;
    private LeaveType leaveType;

    public Request(UUID empId, Date startDate, Date endDate, LeaveType leaveType) {
        this.empId = empId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveType = leaveType;
    }
}
