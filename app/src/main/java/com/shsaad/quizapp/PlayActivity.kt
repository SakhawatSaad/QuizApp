package com.shsaad.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shsaad.quizapp.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {



   private lateinit var binding : ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityPlayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val quizQ = LocalData.questions[0]

        binding.questiontxt.text=quizQ.question
        binding.option1.text= quizQ.option[0]
        binding.option2.text= quizQ.option[1]
        binding.option3.text= quizQ.option[2]
        binding.option4.text= quizQ.option[3]



        binding.nextBtn.setOnClickListener {


            val resultIntent= Intent(this@PlayActivity,ResultActivity::class.java)

            startActivity(resultIntent)
        }




    }
}