package com.example.lab3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.net.URL
import java.net.HttpURLConnection





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
        val httpURLConnection = HttpRequest()
        httpURLConnection.sendHttpGetRequest("https://www.google.com")



    }
}