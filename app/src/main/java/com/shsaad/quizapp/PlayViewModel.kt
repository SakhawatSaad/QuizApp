package com.shsaad.quizapp

import androidx.core.graphics.scaleMatrix
import androidx.lifecycle.ViewModel

class PlayViewModel : ViewModel(){

   private val quizList = LocalData.questions

  private  var CurrentIndex=0
    private  var Score=0


    fun getCurrentQuestion() : quizQ {

        return quizList[CurrentIndex]

    }

    fun NextQuestion(): quizQ? {
        CurrentIndex ++
        return if (CurrentIndex < quizList.size) {
            quizList[CurrentIndex]

        }else{
            null
        }
    }



    fun checkAnswer(selectedIndex : Int){
        val currentQuiz = quizList[CurrentIndex]
        if ( selectedIndex == currentQuiz.anwer){

            Score +=2
        }else{
            Score--

        }

    }

    fun  getScore(): Int {

        return  Score
    }


}