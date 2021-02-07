package com.dev.minread

object Minread {

    fun minutesRead(string: String, message: String = "min read"): String {

        val wordCount = countWords(string)
        var minutes = wordCount / 200
        minutes = if(minutes < 1) 1 else minutes

        return "$minutes $message"
    }


    internal fun countWords(inputString: String): Int =
        inputString.trim().split("\\s+".toRegex()).size
}