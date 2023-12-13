package net.davidcrotty.algochallenges

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TimeBasedKeystoreTest {

    @Test
    fun testNovalue() {
        val key = "foo"
        val timestamp = 1

        val sut = TimeBasedKeystore()
        val actual = sut.get(key, timestamp)

        val expected = ""
        assertEquals(expected, actual)
    }

    @Test
    fun testSetValue() {
        val key = "bar"
        val value = "bazz"
        val timestamp = 1

        val sut = TimeBasedKeystore()
        sut.set(key, value, timestamp)

        val actual = sut.get(key, timestamp)

        val expected = "bazz"
        assertEquals(expected, actual)
    }

    @Test
    fun testSetDifferentValueForTimestamp() {
        val key = "bar"
        val value = "bazz"
        val timestamp = 1
        val sut = TimeBasedKeystore()
        sut.set(key, value, timestamp)

        val newValue = "foo2"
        val newTimestamp = 2
        sut.set(key, newValue, newTimestamp)

        val newValue2 = "foo3"
        val newTimestamp2 = 4
        sut.set(key, newValue2, newTimestamp2)

        val actual = sut.get(key, timestamp)

        val expected = "bazz"
        assertEquals(expected, actual)
    }
}