package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

     private static final double TOL = 1e-4;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
@Test
    public void testAverage() {
        Sqrt s = new Sqrt(0);
        double result = s.average(4.0, 9.0);
        assertEquals(6.5, result, 1e-9);
    }

    @Test
    public void testGoodTrue() {
        Sqrt s = new Sqrt(0);
        assertTrue( s.good(2.0, 4.0));
    }

    @Test
    public void testGoodFalse() {
        Sqrt s = new Sqrt(0);
        assertFalse( s.good(1.9, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt s = new Sqrt(0);
        // improve(1,4) = average(1, 4/1) = (1 + 4)/2 = 2.5
        assertEquals( 2.5, s.improve(1.0, 4.0), 1e-9);
    }

    @Test
    public void testIterPerfectSquare() {
        Sqrt s = new Sqrt(0);
        double out = s.iter(1.0, 9.0);
        assertEquals(3.0, out, TOL);
    }

    @Test
    public void testIterDifferentStart() {
        Sqrt s = new Sqrt(0);
        double out = s.iter(10.0, 16.0);
        assertEquals(4.0, out, TOL);
    }

    @Test
    public void testCalcPerfectSquare() {
        Sqrt s = new Sqrt(25.0);
        assertEquals(5.0, s.calc(), TOL);
    }

    @Test
    public void testCalcNonSquare() {
        Sqrt s = new Sqrt(2.0);
        assertEquals( Math.sqrt(2.0), s.calc(), TOL);
    }

    @Test
    public void testCalcZero() {
        Sqrt s = new Sqrt(0.0);
        assertEquals( s.calc(), 0.0, TOL);
    }

    @Test
    public void testIterNegativeInitialGuess() {
        Sqrt s = new Sqrt(0);
        assertEquals( -3.0, s.iter(-1.0, 9.0), TOL);
    }

}
