package com.example.roomdatabseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdatabseproject.Model.Student
import com.example.roomdatabseproject.database.AppDatbase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentDatabase=AppDatbase.getDatabase(this)

        val studentRecord=studentDatabase?.studentdao()?.getstudentDetail("2500")


//        var student=Student(0,"Theta Solutions","Android Development With kotlin","4000")
//        studentDatabase?.studentdao()?.insertStudent(student)
    }
}