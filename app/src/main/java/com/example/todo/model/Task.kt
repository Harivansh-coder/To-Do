package com.example.todo.model

import android.widget.Toast

class Task {

    var taskName: String? = null
    var taskStatus: Boolean? = null

    fun temp() {}

    fun temp(taskName: String?, taskStatus: Boolean?) {
        this.taskName = taskName
        this.taskStatus = taskStatus
    }

//    fun getTaskName(): String? {
//        return taskName
//    }
//
//    fun setTaskName(taskName: String?) {
//        this.taskName = taskName
//    }
//
//    fun getTaskStatus(): Boolean? {
//        return taskStatus
//    }
//
//    fun setTaskStatus(taskStatus: Boolean?) {
//        this.taskStatus = taskStatus
//    }


}