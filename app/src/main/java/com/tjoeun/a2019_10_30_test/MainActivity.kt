package com.tjoeun.a2019_10_30_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var inputId =idEdt.text.toString()
            var inputPw=pwEdt.text.toString()

//            Toast.makeText(this,String.format("ID: %s, PW: %s",inputId,inputPw),Toast.LENGTH_SHORT).show();


            val printStr ="ID는 ${inputId.toLowerCase()}이고 PW: ${inputPw}입니다,"
            Toast.makeText(this,printStr,Toast.LENGTH_SHORT).show()



        }


        }


    }

