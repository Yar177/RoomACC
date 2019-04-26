package com.example.android.todolist.database;

import java.util.concurrent.Executor;

public class AppExecutors {
    //create singlton class
    private static final Object LOCK = new Object();
    private static AppExecutors sInstance;
    private final Executor diskIO;
    private final Executor mainTHread;
    private final Executor networkIO;

    public AppExecutors(Executor diskIO, Executor mainTHread, Executor networkIO) {
        this.diskIO = diskIO;
        this.mainTHread = mainTHread;
        this.networkIO = networkIO;
    }



}
