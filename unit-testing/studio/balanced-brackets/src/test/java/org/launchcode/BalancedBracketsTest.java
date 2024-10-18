package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsBackwardsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void onlyStringWithNoBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(("LaunchCode")));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void stringWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void bracketPairAtBeginningAndEndOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] LaunchCode []"));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[code]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[]"));
    }

    @Test
    public void onlyOpenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void evenPairsOfNestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
}
