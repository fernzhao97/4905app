package com.abc

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuickSortQuizActivity : AppCompatActivity(),View.OnClickListener{
    var mCurrentPosition:Int = 1
    var mQuestionsList: ArrayList<QuickSortQuestions>?= null
    var mSelectedOptionPosition :Int =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_sort_quiz)


        val optionA: TextView = findViewById(R.id.optionA)
        val optionB: TextView = findViewById(R.id.optionB)
        val optionC: TextView = findViewById(R.id.optionC)
        val optionD: TextView = findViewById(R.id.optionD)


        mQuestionsList = Constants.getQuestions()

        setQuestion()


        optionA.setOnClickListener(this)
        optionB.setOnClickListener(this)
        optionC.setOnClickListener(this)
        optionD.setOnClickListener(this)




    }

    private fun setQuestion(){
        mCurrentPosition=1
        val questions = mQuestionsList!![mCurrentPosition-1]
        defaultOptionsView()
        val optionA: TextView = findViewById(R.id.optionA)
        val optionB: TextView = findViewById(R.id.optionB)
        val optionC: TextView = findViewById(R.id.optionC)
        val optionD: TextView = findViewById(R.id.optionD)
        val progressBar: ProgressBar = findViewById(R.id.progressBar_QS)
        val progressText: TextView = findViewById(R.id.progressText_QS)
        val questionQS: TextView = findViewById(R.id.QSQuizID)
        val quesitonImage:ImageView=findViewById(R.id.QSQuizImage)

        progressBar.progress=mCurrentPosition
        progressText.text = "$mCurrentPosition" + "/"+ progressBar.max
        questionQS.text = questions!!.question
        quesitonImage.setImageResource(questions.image)
        optionA.text=questions.OptionA
        optionB.text=questions.OptionB
        optionC.text=questions.OptionC
        optionD.text=questions.OptionD

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        val optionA: TextView = findViewById(R.id.optionA)
        val optionB: TextView = findViewById(R.id.optionB)
        val optionC: TextView = findViewById(R.id.optionC)
        val optionD: TextView = findViewById(R.id.optionD)

        options.add(0, optionA)
        options.add(1, optionB)
        options.add(2, optionC)
        options.add(3, optionD)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.option_background)

        }
    }

    override fun onClick(v: View?) {
        val optionA: TextView = findViewById(R.id.optionA)
        val optionB: TextView = findViewById(R.id.optionB)
        val optionC: TextView = findViewById(R.id.optionC)
        val optionD: TextView = findViewById(R.id.optionD)


        when(v?.id){
            R.id.optionA ->{
                selectedOptionView(optionA,1)
            }
            R.id.optionB ->{
                selectedOptionView(optionB,2)
            }
            R.id.optionC ->{
                selectedOptionView(optionC,3)
            }
            R.id.optionD ->{
                selectedOptionView(optionD,4)
            }
        }
    }

    private fun selectedOptionView(textView: TextView, selectOptionN:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectOptionN
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface,Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(this, R.drawable.selected_option)



    }
}