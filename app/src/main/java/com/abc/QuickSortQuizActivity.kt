package com.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuickSortQuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_sort_quiz)

        val questionsList = Constants.getQuestions()
        Log.i("Question Size", "${questionsList.size}")
    }
}