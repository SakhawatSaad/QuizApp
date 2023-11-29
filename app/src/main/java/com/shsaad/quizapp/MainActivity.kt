package com.shsaad.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shsaad.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState:Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.Startbtn.setOnClickListener {

            val Playintent = Intent (this@MainActivity,PlayActivity :: class.java)
            startActivity(Playintent)


        }
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}