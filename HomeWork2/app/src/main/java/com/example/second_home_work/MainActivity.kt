// MainActivity.kt
package com.example.second_home_work

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val expert = ProgramExpert()
    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button: Button = findViewById(R.id.button)
        val spinner: Spinner = findViewById(R.id.spinner)
        val textView: TextView = findViewById(R.id.textView)
        button.setOnClickListener {
            textView.text = expert.getLanguage(spinner.selectedItem.toString())
        }
        val button2: Button = findViewById(R.id.button2)
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        val scrollView: ScrollView = findViewById(R.id.scrollView)
        button2.setOnClickListener {
            clickCount++
            val newTextView = TextView(this)
            newTextView.text = getString(R.string.new_text, clickCount)
            linearLayout.addView(newTextView)
            scrollView.post {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN)
            }
        }
    }
}