package com.example.roomdatabseproject.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student (
    @PrimaryKey(autoGenerate = true)
    val studentID:Int,
    @ColumnInfo(name = "Student_Name")
    val studentName:String,
    @ColumnInfo(name = "Student_Course")
    val studentCourse:String,
    @ColumnInfo(name = "Student_Fee")
    val studentFee:String
        )