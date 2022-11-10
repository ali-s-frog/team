package io.robusta.team.play

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Play {

    @Test
    fun play1() {
        val flatten = listOf(listOf(1, 2, 3, 5), listOf(1, 2, 3, 5), listOf(1, 2, 3, 5)).flatten()
        assertEquals(flatten, listOf(1, 2, 3, 5, 1, 2, 3, 5, 1, 2, 3, 5))
    }
}
