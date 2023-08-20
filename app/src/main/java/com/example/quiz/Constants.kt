package com.example.quiz

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
        R.drawable.ic_flag_of_argentina,
            "Australia",
            "Argentina",
            "Armenia",
            "Austria",
            2)
        val que2 = Question(2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Argentina",
            "Armenia",
            "Austria",
            1)
        val que3 = Question(3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Bulgaria",
            "Belarus",
            "Belgium",
            4)
        val que4 = Question(4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Jamaica",
            "Bolivia",
            "Uruguay",
            1)
        val que5 = Question(5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Switzerland",
            "Sweden",
            "Denmark",
            "Columbia",
            3)
        val que6 = Question(6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Indonesia",
            "Cyprus",
            "Haiti",
            1)
        val que7 = Question(7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Belgium",
            "Austria",
            "Finland",
            "Germany",
            4)
        val que8 = Question(8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Nepal",
            "India",
            "Thailand",
            "Mongolia",
            2)
        val que9 = Question(9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Nigeria",
            "Kenia",
            "Kuwait",
            "Sudan",
            3)
        val que10 = Question(10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand",
            "New Caledonia",
            "Tonga",
            "Nicaragua",
            1)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}