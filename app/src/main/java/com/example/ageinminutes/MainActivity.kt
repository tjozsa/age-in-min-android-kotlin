package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener {view ->
            clickDatePicker(view)
        }

    }

    private fun clickDatePicker(view:View) {

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)


        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener {
                    view, year, month, day ->
                // whatever we put here, it will be executed once the date picker has been closed
                // you can use this to use the selected date.
                Toast.makeText(this, ""+year +""+month+""+day, Toast.LENGTH_LONG).show()
                // toast is only shown if you select a date, not if you tap cancel.
            },
            year,
            month,
            day).show()
    }
}