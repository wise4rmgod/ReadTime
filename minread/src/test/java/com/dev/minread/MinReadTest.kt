package com.dev.minread

import org.junit.Assert
import org.junit.Test

class MinReadTest {
    @Test
    fun `word count returns 10`() {
        val words = "one two three four five six seven eight nine ten "
        val count = Minread.countWords(words)
        Assert.assertEquals(10, count)
    }
}