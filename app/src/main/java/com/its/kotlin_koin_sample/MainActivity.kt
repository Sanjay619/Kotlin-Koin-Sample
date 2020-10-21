package com.its.kotlin_koin_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.koin.android.ext.android.get
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = get<Student>();
        student.beSmart();

        val student2 = get<Student>();
        student2.beSmart();

    }
}