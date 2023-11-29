package com.shsaad.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.shsaad.quizapp.databinding.ActivityPlayBinding

class PlayActivity : AppCompatActivity() {


    private val viewModel : PlayViewModel by viewModels()

   private lateinit var binding : ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityPlayBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        showCurrentQuestion()


        binding.nextBtn.setOnClickListener {
            val selectedIndex =
                binding.radioGrop
                    .indexOfChild(
                        findViewById(binding.radioGrop.checkedRadioButtonId))

            if (selectedIndex!= -1){

                viewModel.checkAnswer(selectedIndex)
                setNextQuestion()
            }else{

                Toast.makeText(this,"selected an Option",Toast.LENGTH_LONG).show()
            }



        }



    }

    private fun showCurrentQuestion (){

        val currentQuestion= viewModel.getCurrentQuestion()

        binding.questiontxt.text=currentQuestion.question
        binding.option1.text= currentQuestion.option[0]
        binding.option2.text= currentQuestion.option[1]
        binding.option3.text= currentQuestion.option[2]
        binding.option4.text= currentQuestion.option[3]

        binding.radioGrop.clearCheck()

    }

    private fun setNextQuestion() {


        val nextQuestion= viewModel.NextQuestion()

        if (nextQuestion!= null){

            showCurrentQuestion()
        }else{

            val resultIntent =  Intent(this@PlayActivity,ResultActivity ::class.java)

            resultIntent.putExtra("Score", viewModel.getScore())
            startActivity(resultIntent)

        }


    }


}
