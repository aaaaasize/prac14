package com.example.testasize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    private lateinit var gradeTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        gradeTextView = findViewById(R.id.grade_text_view)

        val correctPercent = intent.getDoubleExtra("correctPercent", 0.0)
        val incorrectPercent = intent.getDoubleExtra("incorrectPercent", 0.0)
        val rating = intent.getIntExtra("rating", 0)

        val resultText = "Верно отвечено на : $correctPercent%\nНеверно: $incorrectPercent%\nВаша оценка $rating"
        gradeTextView.text = resultText
    }
}