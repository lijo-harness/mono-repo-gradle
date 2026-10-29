
package com.example.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    @Test
    void shouldReverseString() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void shouldIdentifyPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertTrue(
            stringUtils.isPalindrome("A man, a plan, a canal: Panama")
        );
    }

    @Test
    void shouldRejectNonPalindrome() {
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void shouldCountWords() {
        assertEquals(3, stringUtils.countWords("Harness CI Testing"));
    }

    @Test
    void shouldReturnZeroForEmptyInput() {
        assertEquals(0, stringUtils.countWords("   "));
    }

    @Test
    void shouldCapitalizeFirstLetter() {
        assertEquals("Harness", stringUtils.capitalize("harness"));
    }

    @Test
    void shouldHandleEmptyString() {
        assertEquals("", stringUtils.capitalize(""));
    }

    @Test
    void shouldRejectNullWhenReversing() {
        assertThrows(
            IllegalArgumentException.class,
            () -> stringUtils.reverse(null)
        );
    }
}
