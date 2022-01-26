package com.khiky.sibiodata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_layout)


    }

    fun pindah(view: android.view.View) {
        intent = Intent(this, sec_act::class.java)
        startActivity(intent)
    }


}

