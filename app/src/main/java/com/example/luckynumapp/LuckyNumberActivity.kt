package com.example.luckynumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1 : TextView = findViewById(R.id.text1)
        val luckyText : TextView = findViewById(R.id.luckyNumTxt)
        val shareBtn : Button = findViewById(R.id.shareBtn)

        var user_name = receiveUserName()

        var random_num = generateRandomNum()
        luckyText.setText(""+random_num)

    }


    fun receiveUserName():String{
        var bundle: Bundle? =intent.extras
        var username =bundle?.get("name").toString()
        return username
    }


    fun generateRandomNum():Int{
      val random = Random.nextInt(1000)
        return random
    }

    fun shareData(Username:String,num:Int){
     var i = Intent(Intent.ACTION_SEND)
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today")
    }
}