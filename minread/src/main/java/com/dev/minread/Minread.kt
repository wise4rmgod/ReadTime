package com.dev.minread

object Minread {

    fun minread(string: String): String {

        val word_count = countWords(string)
        val total = word_count / 200
        if (total < 1)
            return "0.5 min read"
        else
            return "$total min read"
    }

    fun custome_minread(string: String, message: String): String {

        val word_count = countWords(string)
        val total = word_count / 200
        if (total < 1)
            return "0.5 $message"
        else
            return "$total $message"

    }

    internal fun countWords(inputString: String): Int =
        inputString.trim().split("\\s+".toRegex()).size
}