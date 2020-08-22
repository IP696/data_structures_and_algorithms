package com.pavel.example;

import com.pavel.utils.FirstLastList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstLastListExampleTest {

    @Test
    public void addFirstDeleteFirst() {
        FirstLastList<Character> list = new FirstLastList<>();
        list.addFirst('P');
        list.addFirst('A');
        list.addFirst('V');
        list.addFirst('E');
        list.addFirst('L');

        StringBuilder builder = new StringBuilder();
        while (!list.isEmpty()) {
            builder.append(list.deleteFirst());
        }

        assertEquals("LEVAP", builder.toString());
    }

    @Test
    public void addLastDeleteFirst() {
        FirstLastList<Character> list = new FirstLastList<>();
        list.addLast('P');
        list.addLast('A');
        list.addLast('V');
        list.addLast('E');
        list.addLast('L');

        StringBuilder builder = new StringBuilder();
        while (!list.isEmpty()) {
            builder.append(list.deleteFirst());
        }

        assertEquals("PAVEL", builder.toString());
    }
}
