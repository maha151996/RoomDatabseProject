package com.example.roomdatabseproject.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomdatabseproject.DAO.dao
import com.example.roomdatabseproject.Model.Student


@Database(entities = [Student::class], version = 4)
abstract class AppDatbase : RoomDatabase(){
    abstract fun studentdao() : dao

    companion object{
        private var INSTANCE: AppDatbase? =null
        val MIGRATION_3_4=object :Migration(3,4){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE Student ADD Student_Fee Float")
            }

        }


//        val MIGRATION_2_3 = object : Migration(2, 3){
//            override fun migrate(database: SupportSQLiteDatabase) {
//                database.execSQL("ALTER TABLE <entity-name> ADD COLUMN <new-column-name> <column-data-type>" )
//            }
//        }
         fun getDatabase(context: Context): AppDatbase {
             var tempInstance=INSTANCE
             if(tempInstance!=null)
             {
                 return tempInstance
             }
             synchronized(this){

                 val instance=Room.databaseBuilder(context, AppDatbase::class.java, "Student_Database")
                     .allowMainThreadQueries()
                         .addMigrations(MIGRATION_3_4)
                     .build()
                 INSTANCE=instance
                 return instance
             }

         }

    }
}