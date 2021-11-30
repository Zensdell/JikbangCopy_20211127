package com.kkk.jikbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        2.5초 이후에 화면 전환 으로 지연시켜보자.
        val myHandler = Handler( Looper.getMainLooper() ) // 메인쓰레드 (UI 전담쓰레드 ) 소환

        myHandler.postDelayed({

//          2.5초뒤에 실행할 일 : 메인화면으로 이동하기
            val myIntent = Intent(this,MainActivity::class.java)
            startActivity(myIntent)

            finish()


        },2500)


    }
}