package com.tjoeun.a2019_10_30_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {

            var inputId=loginIdEdt.text.toString()

            Toast.makeText(this,inputId,Toast.LENGTH_SHORT).show()

            var inputPw=pw.text.toString()

            if(inputId=="admin" && inputPw="1234"){
                    Toast.makeText("관리자로 로그인 합니다")
            } else{
                Toast.makeText("아이디 혹은 비번이 잘못되었습니다.")
            }


        }


        }


    }

