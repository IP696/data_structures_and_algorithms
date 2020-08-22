package com.pavel.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {

    private DoublyLinkedList<Integer> list;

    @Before
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    public void listShouldBeCreated() {
        assertNotNull(list);
    }

    @Test
    public void createdListShouldBeEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void listWithAddedFirstOneElementShouldBeNotEmpty() {
        list.addFirst(1);

        assertFalse(list.isEmpty());
    }

    @Test
    public void createdListShouldHas0Size() {
        assertEquals(0, list.size());
    }

    @Test
    public void listWithAddedOneFirstElementShouldHas1Size() {
        list.addFirst(1);

        assertEquals(1, list.size());
    }

    @Test
    public void listWithAddedTwoFirstElementsShouldHas2Size() {
        list.addFirst(1);
        list.addFirst(2);

        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteFirstFromEmptyListShouldThrowException() {
        list.removeFirst();
    }

    @Test
    public void deleteFirstFromListWithOneItemMakesItEmpty() {
        list.addFirst(1);
        list.removeFirst();

        assertTrue(list.isEmpty());
    }

    @Test
    public void deleteFirstShouldDeleteAndReturnFirstItem() {
        list.addFirst(1);
        list.addFirst(2);

        assertEquals(new Integer(2), list.removeFirst());
        assertEquals(new Integer(1), list.removeFirst());
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void listContainsItem() {
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        assertTrue(list.contains(2));
    }

    @Test
    public void listWithAddedLastOneElementShouldBeNotEmpty() {
        list.addLast(1);

        assertFalse(list.isEmpty());
    }

    @Test
    public void listWithAddedLastElementShouldHas1Size() {
        list.addLast(1);

        assertEquals(1, list.size());
    }

    @Test
    public void listWithAddedTwoLastElementsShouldHas2Size() {
        list.addLast(1);
        list.addLast(2);

        assertFalse(list.isEmpty());
        assertEquals(2, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteLastFromEmptyListShouldThrowException() {
        list.removeLast();
    }

    @Test
    public void deleteLastFromListWithOneItemMakesItEmpty() {
        list.addLast(1);
        list.removeLast();

        assertTrue(list.isEmpty());
    }

    @Test
    public void deleteLastShouldDeleteAndReturnLastItem() {
        list.addLast(1);
        list.addLast(2);

        assertEquals(new Integer(2), list.removeLast());
        assertEquals(new Integer(1), list.removeLast());
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void add2FirstAndDelete2LastShouldMakeListEmpty() {
        list.addFirst(1);
        list.addFirst(2);

        assertEquals(new Integer(1), list.removeLast());
        assertEquals(new Integer(2), list.removeLast());
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void add2LastAndDelete2FirstShouldMakeListEmpty() {
        list.addLast(1);
        list.addLast(2);

        assertEquals(new Integer(1), list.removeFirst());
        assertEquals(new Integer(2), list.removeFirst());
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void addAfterShouldAddItemToCertainPlace() {
        list.addFirst(3);
        list.addFirst(1);

        assertTrue(list.addAfter(1, 2));
        assertEquals(new Integer(1), list.removeFirst());
        assertEquals(new Integer(2), list.removeFirst());
        assertEquals(new Integer(3), list.removeFirst());
    }

    @Test
    public void addAfterNotExistItemShouldReturnFalse() {
        list.addFirst(1);
        list.addFirst(2);

        assertFalse(list.addAfter(3, 4));
    }

    @Test
    public void addAfterLastItemShouldReturnTrue() {
        list.addLast(1);
        list.addLast(2);

        assertTrue(list.addAfter(2, 3));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void deleteKeyCalledOnEmptyListShouldThrowException() {
        list.deleteKey(1);
    }

    @Test
    public void deleteKeyShouldReturnNegativeValueIfItemDoesNotExist() {
        list.addFirst(1);

        assertNull(list.deleteKey(2));
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    public void deleteKeyShouldReturnValueIfItemPlacedInTheMiddleOfList() {
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        assertEquals(new Integer(2), list.deleteKey(2));
        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    public void deleteKeyShouldReturnValueIfItemPlacedInTheStartOfList() {
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        assertEquals(new Integer(3), list.deleteKey(3));
        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    public void deleteKeyShouldReturnValueIfItemPlacedInTheEndOfList() {
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        assertEquals(new Integer(1), list.deleteKey(1));
        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }
}
