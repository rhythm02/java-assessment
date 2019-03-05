package com.hashmap.assessment.service;

import com.hashmap.assessment.model.EmpRole;
import com.hashmap.assessment.model.User;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AdminServiceTest {

@Test
    public void addEmpTest(){

    User admin = new User("john", "john@email.com", new Date("02/01/2019"), EmpRole.ADMIN);
}

}