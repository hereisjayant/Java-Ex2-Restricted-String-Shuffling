package lexicon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LexiconTester {

    @Test
    public void testawol() {
        String inputString = "awol";
        int distance = 2;

        String expectedOutput = "owal";
        int expectedOps = 1;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testblitz1() {
        String inputString = "blitz";
        int distance = 2;

        String expectedOutput = "ztilb";
        int expectedOps = 4;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testblitz2() {
        String inputString = "blitz";
        int distance = 3;

        String expectedOutput = "tzibl";
        int expectedOps = 2;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testspoonfeed() {
        String inputString = "feedspoon";
        int distance = 1;

        String expectedOutput = "spoonfeed";
        int expectedOps = 20;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testDumbledore() {
        String inputString = "Dumbledore";
        int distance = 3;

        String expectedOutput = "eurdombleD";
        int expectedOps = 9;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testzyxx() {
        String inputString = "zyxx";
        int distance = 2;

        String expectedOutput = "zyxx";
        int expectedOps = 0;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

    @Test
    public void testLargeDistance() {
        String inputString = "abcde";
        int distance = 10;

        String expectedOutput = "abcde";
        int expectedOps = 0;

        assertEquals(expectedOutput, Lexicon.makeGreatest(inputString, distance));
        assertEquals(expectedOps, Lexicon.countOperations(inputString, distance));
    }

}
