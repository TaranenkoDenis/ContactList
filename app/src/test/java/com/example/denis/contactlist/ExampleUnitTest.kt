package com.example.denis.contactlist

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun add_wrongTest() {
        assertEquals(4, sum(3, 2))
    }

    @Test
    @Throws(Exception::class)
    fun add_isCorrect() {
        assertEquals(4, sum(2, 2))
    }

    @Test
    @Throws(Exception::class)
    fun add_twoDigits_isCorrect() {
        assertEquals(44, sum(22, 22))
    }

    @Test
    @Throws(Exception::class)
    fun add_big_isCorrect() {
        assertEquals(4444, sum(2222, 2222))
    }
}
