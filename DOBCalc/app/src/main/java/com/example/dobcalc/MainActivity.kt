package com.example.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var textDate: TextView? = null
    private var textMin: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val datePicker : Button = findViewById(R.id.btnDatePicker)
        textDate = findViewById(R.id.textDate)
        textMin = findViewById(R.id.textMin)


        datePicker.setOnClickListener {
            clickDatePicker()
        }
    }



    private fun clickDatePicker(){

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        val dpd =
        DatePickerDialog(
            this,
            //DatePickerDialog.OnDateSetListener
            { _, selectedYear, selectedMonth, selectedDayOfMonth ->

                val selectedDate = "$selectedYear.${selectedMonth+1}.$selectedDayOfMonth"
                textDate?.text = selectedDate

                val sdf = SimpleDateFormat("yyyy.MM.dd", Locale.ENGLISH)

                val theDate = sdf.parse(selectedDate)
                theDate?.let{
                    val selectedDateInMinutes = theDate.time / 60000 //time returns time in miliseconds
                    val timeNow = sdf.parse(sdf.format(System.currentTimeMillis()))
                    timeNow?.let {
                        val currentDateInMinutes = timeNow.time / 60000

                        val differenceInMinutes = currentDateInMinutes - selectedDateInMinutes

                        textMin?.text = differenceInMinutes.toString()
                    }
                }
            },
            year,
            month,
            day
        )
        dpd.datePicker.maxDate = System.currentTimeMillis() - 8640000
        dpd.show()
    }


}

