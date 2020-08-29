package com.pavel.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void n1ShouldReturn1() {
        assertEquals(1, triangle.getResult(1));
    }

    @Test
    public void n2ShouldReturn3() {
        assertEquals(3, triangle.getResult(2));
    }

    @Test
    public void n3ShouldReturn6() {
        assertEquals(6, triangle.getResult(3));
    }

    @Test
    public void n4ShouldReturn10() {
        assertEquals(10, triangle.getResult(4));
    }

    @Test
    public void n5ShouldReturn15() {
        assertEquals(15, triangle.getResult(5));
    }

    @Test
    public void n6ShouldReturn21() {
        assertEquals(21, triangle.getResult(6));
    }

    @Test
    public void n7ShouldReturn28() {
        assertEquals(28, triangle.getResult(7));
    }

    @Test
    public void n8ShouldReturn36() {
        assertEquals(36, triangle.getResult(8));
    }

    @Test
    public void n9ShouldReturn45() {
        assertEquals(45, triangle.getResult(9));
    }

    @Test
    public void n10ShouldReturn55() {
        assertEquals(55, triangle.getResult(10));
    }
}
