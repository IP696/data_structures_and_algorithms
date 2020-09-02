package com.pavel.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciCycleTest {

    private FibonacciCycle fibonacci;

    @Before
    public void setUp() {
        fibonacci = new FibonacciCycle();
    }

    @Test
    public void n0ShouldReturn0() {
        assertEquals(0, fibonacci.getResult(0));
    }

    @Test
    public void n1ShouldReturn1() {
        assertEquals(1, fibonacci.getResult(1));
    }

    @Test
    public void n2ShouldReturn1() {
        assertEquals(1, fibonacci.getResult(2));
    }

    @Test
    public void n3ShouldReturn2() {
        assertEquals(2, fibonacci.getResult(3));
    }

    @Test
    public void n4ShouldReturn3() {
        assertEquals(3, fibonacci.getResult(4));
    }

    @Test
    public void n5ShouldReturn5() {
        assertEquals(5, fibonacci.getResult(5));
    }

    @Test
    public void n6ShouldReturn8() {
        assertEquals(8, fibonacci.getResult(6));
    }

    @Test
    public void n7ShouldReturn13() {
        assertEquals(13, fibonacci.getResult(7));
    }

    @Test
    public void n8ShouldReturn21() {
        assertEquals(21, fibonacci.getResult(8));
    }

    @Test
    public void n9ShouldReturn34() {
        assertEquals(34, fibonacci.getResult(9));
    }

    @Test
    public void n10ShouldReturn55() {
        assertEquals(55, fibonacci.getResult(10));
    }
}
