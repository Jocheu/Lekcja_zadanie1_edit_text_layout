package com.example.formempty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOK).setOnClickListener {
            var imie = findViewById<EditText>(R.id.txtImie).text.toString();
            var nazwisko = findViewById<EditText>(R.id.txtNazwisko).text.toString();
            if (imie == ""){
                findViewById<TextView>(R.id.textview_first).text = "wypełnij wszystkie pola";
            }
            else if (nazwisko == ""){
                findViewById<TextView>(R.id.textview_first).text = "wypełnij wszystkie pola";
            }
            else{
                findViewById<TextView>(R.id.textview_first).text = "dane poprawne";
            }
        }
    }
}