package com.example.testingonandroid.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    //empty password
    //password was repeated incorrectly
    //password contains less than 2 digits

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `returns false when password repeated incorrectly`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "ABC",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `returns false when password less than 2 digit`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "ABCD1",
            "ABCD12"
        )
        assertThat(result).isFalse()
    }
}