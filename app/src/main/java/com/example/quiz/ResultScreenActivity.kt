package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityResultScreenBinding

class ResultScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        binding.tvUsername.text = userName
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 10)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvScoreText.text = "Your score is $correctAnswers out of $totalQuestions"

        binding.btnFinish.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}