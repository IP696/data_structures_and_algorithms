package com.pavel.factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialCycleTest {

    private FactorialCycle factorial;

    @Before
    public void setUp() {
        factorial = new FactorialCycle();
    }

    @Test
    public void n0ShouldReturn1() {
        assertEquals(1, factorial.getResult(0));
    }

    @Test
    public void n1ShouldReturn1() {
        assertEquals(1, factorial.getResult(1));
    }

    @Test
    public void n2ShouldReturn2() {
        assertEquals(2, factorial.getResult(2));
    }

    @Test
    public void n3ShouldReturn6() {
        assertEquals(6, factorial.getResult(3));
    }

    @Test
    public void n4ShouldReturn24() {
        assertEquals(24, factorial.getResult(4));
    }

    @Test
    public void n5ShouldReturn120() {
        assertEquals(120, factorial.getResult(5));
    }

    @Test
    public void n6ShouldReturn720() {
        assertEquals(720, factorial.getResult(6));
    }

    @Test
    public void n7ShouldReturn5040() {
        assertEquals(5040, factorial.getResult(7));
    }

    @Test
    public void n8ShouldReturn40320() {
        assertEquals(40320, factorial.getResult(8));
    }

    @Test
    public void n9ShouldReturn362880() {
        assertEquals(362880, factorial.getResult(9));
    }

    @Test
    public void n10ShouldReturn3628800() {
        assertEquals(3628800, factorial.getResult(10));
    }
}
