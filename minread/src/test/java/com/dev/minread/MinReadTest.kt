package com.dev.minread

import org.junit.Assert
import org.junit.Test

class MinReadTest {
    @Test
    fun `word count returns 176`() {
        val count = Minread.countWords(DataFactory.words)
        Assert.assertEquals(176, count)
    }

    @Test
    fun `check minutes read is 1 min`() {
        val longRead = DataFactory.words
        val duration = Minread.minutesRead(longRead)
        Assert.assertEquals("1 min read", duration)
    }
}

object DataFactory {
    const val words = """i will probably never tell you these things

i. there are days i wake up not remembering that love brought me here.

ii. on those days i lie in bed and want to disappear. i count backwards and erase each day as i go till i’m back to where it all started

iii. i am back in the light of a sweet grin and polished words that reflect the moon he was going to give and other lies.

iv. i am back in a heart that fell into love and stayed there, stubborn and rooted even after it had began to hurt and long before i knew better

v. i see both of these things in myself and you. i am careful not to promise you things because i know how easily the past repeats itself.

vi. how do i tell you that all these fights are so much greater than where we are right now.

i am scared to fall in love that has roots so deep that to leave may mean only half surviving"""
}