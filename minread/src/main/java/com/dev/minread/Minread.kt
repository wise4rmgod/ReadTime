package com.dev.minread

object Minread {

    fun readtime(string: String): String {

        val word_count = string.length
        val total = word_count / 200
        if (total == 0)
            return "0.5 min read"
        else
            return "$total min read"
    }

    fun custome_readtime(string: String, message: String): String {

        val word_count = string.length
        val total = word_count / 200
        if (total == 0)
            return "0.5 $message"
        else
            return "$total $message"

    }

    fun wordcount(string: String): String {

        val word_count = string.length
        val total = word_count / 200
        return word_count.toString()

    }
}