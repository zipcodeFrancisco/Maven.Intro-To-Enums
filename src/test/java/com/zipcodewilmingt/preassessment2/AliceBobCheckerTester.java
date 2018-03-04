package com.zipcodewilmingt.preassessment2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/3/18.
 */
public class AliceBobCheckerTester {
    @Test
    public void testLeon() {
        // Given
        String input = "Leon";
        AliceBobChecker abc = new AliceBobChecker(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertFalse(isBob);
    }

    @Test
    public void testWilhem() {
        // Given
        String input = "Tariq";
        AliceBobChecker abc = new AliceBobChecker(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertFalse(isBob);
    }

    @Test
    public void testBob() {
        // Given
        String input = "Bob";
        AliceBobChecker abc = new AliceBobChecker(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertFalse(isAlice);
        Assert.assertTrue(isBob);
    }


    @Test
    public void testAlice() {
        // Given
        String input = "Alice";
        AliceBobChecker abc = new AliceBobChecker(input);

        // When
        boolean isAlice = abc.isAlice();
        boolean isBob = abc.isBob();

        // Then
        Assert.assertTrue(isAlice);
        Assert.assertTrue(isBob);
    }
}
