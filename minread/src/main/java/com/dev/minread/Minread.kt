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

    fun countWords(inputString: String): Int {
        //Split String by Space
        val strArray = inputString.split(" ".toRegex()).toTypedArray() // Spilt String by Space
        val sb = StringBuilder()
        var count = 0

        //iterate String array
        for (s in strArray) {
            if (s != "") {
                //Increase Word Counter
                count++
            }
        }
        return count
    }
}