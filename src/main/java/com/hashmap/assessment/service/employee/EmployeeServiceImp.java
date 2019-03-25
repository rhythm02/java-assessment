package com.hashmap.assessment.service.employee;

import com.hashmap.assessment.exception.NoLeaveException;
import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.LeaveType;
import com.hashmap.assessment.model.Request;
import com.hashmap.assessment.model.employee.Employee;
import com.hashmap.assessment.service.DatabaseService;
import com.hashmap.assessment.utility.FindDays;

import java.util.Date;

public class EmployeeServiceImp implements EmployeeService {
    private Database database = DatabaseService.getInstance().getDatabase();

    @Override
    public int viewLeaves(Employee employee) {
        int totalLeaves = 0;
        for (Employee e:database.getEmpList()) {
            if(e.equals(employee)) {
                totalLeaves = e.getLeaves().getTotalLeaves();
            }
        }
        if(totalLeaves == 0){
            throw new NoLeaveException("No Leaves remaining for this employee.");
        }
        else{
            return  totalLeaves;
        }
    }

    @Override
    public void applyLeaves(Request request) {
        for (Employee e:database.getEmpList()) {
            if(e.getUuid()==request.getEmpId()){
                long noOfDays = FindDays.calcNoOfDays(request.getStartDate(), request.getEndDate());
                long newTotalLeaves = e.getLeaves().getTotalLeaves() - noOfDays;

                if(request.getLeaveType() == LeaveType.SL && e.getLeaves().getSickLeave() >= noOfDays) {
                    long newLeaves = e.getLeaves().getSickLeave() - noOfDays;
                    e.getLeaves().setSickLeave((int) newLeaves);
                    e.getLeaves().setTotalLeaves((int) newTotalLeaves);
                }
                else if(request.getLeaveType() == LeaveType.CL && e.getLeaves().getCasualLeave() >= noOfDays) {
                    long newLeaves = e.getLeaves().getCasualLeave() - noOfDays;
                    e.getLeaves().setCasualLeave((int) newLeaves);
                    e.getLeaves().setTotalLeaves((int) newTotalLeaves);
                }
                else if(request.getLeaveType() == LeaveType.PL && e.getLeaves().getPrivilegeLeave() >= noOfDays) {
                    long newLeaves = e.getLeaves().getPrivilegeLeave() - noOfDays;
                    e.getLeaves().setPrivilegeLeave((int) newLeaves);
                    e.getLeaves().setTotalLeaves((int) newTotalLeaves);
                }
                else {
                    throw new NoLeaveException("No leaves remaining for this employee");
                }
            }
        }
    }
}
