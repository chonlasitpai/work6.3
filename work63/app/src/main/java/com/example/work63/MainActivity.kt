package com.example.work63

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var salary:EditText=findViewById(R.id.salary)
        var btncalculate:Button=findViewById(R.id.calculate)
        var total:TextView=findViewById(R.id.total)
        var interest:TextView=findViewById(R.id.interest)
        var btnclear:Button=findViewById(R.id.clear)
        btncalculate.setOnClickListener(){
            var salary=salary.text.toString().toDouble()
            var tax1=0.00
            var tax=0.00

            for(i in 1..3){
                var tax=(salary*3)/100
                tax1=tax1+tax
                salary=tax+salary

            }
            for(i in 1..4){
                var tax=(salary*5)/100
                tax1=tax1+tax
                salary=tax+salary
            }
            for(i in 1..3){
                var tax=(salary*7)/100
                tax1=tax1+tax
                salary=tax+salary
            }


            if(salary>0){
                interest.setText(tax1.toString())
                total.setText(salary.toString())
            }
        }
        btnclear.setOnClickListener(){
            salary.setText("")
            total.setText("")
            interest.setText("")
        }
    }
}