package com.example.android.todolist;

import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase mDB;
    private final int mTasjId;

    public AddTaskViewModelFactory(AppDatabase mDB, int mTasjId) {
        this.mDB = mDB;
        this.mTasjId = mTasjId;
    }




}
