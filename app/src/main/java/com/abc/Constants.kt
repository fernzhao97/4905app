package com.abc

object Constants {
    fun getQuestions():ArrayList<QuickSortQuestions>{
        val questionsList = ArrayList<QuickSortQuestions>()

        val q1 = QuickSortQuestions(1, "What is the correct difference between Kotlin and Java",
        R.drawable.ic_login_hero, "A","B","C","D",1
            )

        questionsList.add(q1)

        val q2 = QuickSortQuestions(1, "Java？",
            R.drawable.ic_login_hero, "A","B","C","D",1
        )

        questionsList.add(q2)
        return questionsList
    }

}