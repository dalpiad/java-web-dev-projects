package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Just a string with no brackets."));
    }

    @Test
    public void extraBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void bracketsWithCharsBetweenTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[testing with words between]"));
    }

    @Test
    public void balancedBracketsWithinBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[just testing [to be] testing]"));
    }

    @Test
    public void bracketInReverseOrderReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void notDistractedByOtherCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{}{{{}]'testing'+ []"));
    }
}