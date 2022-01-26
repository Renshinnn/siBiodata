package com.khiky.sibiodata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class sec_act : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        private lateinit var editNama: EditText
        private lateinit var editTtl: EditText
        private lateinit var editNotel: EditText
        private lateinit var editAlamat: EditText
        private lateinit var tvHasil: TextView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.main_layout)

            editNama = findViewById(R.id.edt_nama)
            editTtl = findViewById(R.id.edt_ttl)
            editNotel = findViewById(R.id.edt_notel)
            editAlamat = findViewById(R.id.edt_alamat)
            tvHasil = findViewById(R.id.tv_hasil)

            val btnSubmit: Button = findViewById(R.id.btn_submit)
            val btnClear: Button = findViewById(R.id.btn_submit)

            btnSubmit.setOnClickListener(this)
            btnClear.setOnClickListener(this)


        }

        public fun onClick(v: View?) {
            if (v != null) {
                when (v.id) {
                    R.id.btn_submit -> {
                        editNama.toString()
                        editTtl.toString()
                        editNotel.toString()
                        editAlamat.toString()
                    }

                }
            }
        }


    }

    private fun Button.setOnClickListener(mainActivity: MainActivity) {

    }

}

private fun Button.setOnClickListener(mainActivity: sec_act.MainActivity) {

}

