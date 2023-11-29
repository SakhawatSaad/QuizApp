package com.shsaad.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shsaad.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var score= intent.getIntExtra("Score",0)


        binding.ScoreTV.text="Score : $score"


    }
}