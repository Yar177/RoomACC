package com.example.android.todolist.database;

import java.util.Date;

public class DateConverter {

    public static Date toDate(Long timestamp){
        return timestamp == null ? null : new Date(timestamp);
    }

}
