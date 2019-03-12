package com.hashmap.assessment.service;

import com.hashmap.assessment.model.Database;
import com.hashmap.assessment.model.User;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
public class DatabaseService {
    private static DatabaseService ourInstance;
    private Database database;

    public static DatabaseService getInstance() {
        if(ourInstance == null) {
            ourInstance = new DatabaseService();
        }
        return ourInstance;
    }

    private DatabaseService() {
        database = new Database();
    }
}
