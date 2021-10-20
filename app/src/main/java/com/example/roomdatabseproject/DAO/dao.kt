package com.example.roomdatabseproject.DAO

import androidx.room.*
import com.example.roomdatabseproject.Model.Student
import com.example.roomdatabseproject.Model.StudentContactInformation

@Dao
interface dao {

    @Insert
    fun insertStudent(vararg student: Student)

    @Update
    fun UpdateStudent(vararg student: Student)

    @Delete
    fun DeleteStudent(vararg student: Student)

    @Query("SELECT * FROM Student")
    fun GetAllStudent():List<Student>

    @Query("SELECT * FROM Student WHERE Student_Course = :courseNAme ")
    fun getallstudentofcourse(courseNAme:String):List<Student>

    @Query("SELECT Student_Name, Student_Course FROM Student WHERE Student_Fee = :stdFee")
    fun getstudentDetail(stdFee:String):List<StudentContactInformation>

}