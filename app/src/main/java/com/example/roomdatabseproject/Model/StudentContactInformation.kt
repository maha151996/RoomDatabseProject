package com.example.roomdatabseproject.Model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey


data class StudentContactInformation (

        @ColumnInfo(name = "Student_Name")
        val studentName:String,
        @ColumnInfo(name = "Student_Course")
        val studentCourse:String,
)