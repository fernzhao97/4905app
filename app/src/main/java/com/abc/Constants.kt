package com.abc

object Constants {
    fun getQuestions():ArrayList<QuickSortQuestions>{
        val questionsList = ArrayList<QuickSortQuestions>()

        val q1 = QuickSortQuestions(1, "What is the correct difference between Kotlin and Java",
        R.drawable.ic_login_hero, "A","B","C","D",1
            )

        questionsList.add(q1)

        val q2 = QuickSortQuestions(2, "Java？",
            R.drawable.ic_login_hero, "A","B","C","D",1
        )

        questionsList.add(q2)

        val q3 = QuickSortQuestions(3, "Kotlin？",
            R.drawable.ic_login_hero, "A","B","C","D",1
        )

        questionsList.add(q3)
        return questionsList
    }

}