package com.example.second_home_work

class ProgramExpert {
    fun getLanguage(feature: String) = when (feature) {
            "快速" -> "C"
            "容易" -> "Python"
            "新语言" -> "Kotlin"
            "面向对象" -> "Java"
            else -> "unknown"
    }
}