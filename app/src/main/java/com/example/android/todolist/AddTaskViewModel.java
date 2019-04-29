package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

class AddTaskViewModel extends ViewModel {
    private LiveData<TaskEntry> task;

    public AddTaskViewModel(AppDatabase mDB, int mTaskId) {
        task = mDB.taskDao().loadTaskById(mTaskId);

    }

    public LiveData<TaskEntry> getTask(){
        return task;
    }


}
