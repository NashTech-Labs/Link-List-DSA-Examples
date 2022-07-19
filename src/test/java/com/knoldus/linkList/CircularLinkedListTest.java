package com.knoldus.linkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircularLinkedListTest {
    /**
     * Method under test: default or parameterless constructor of {@link CircularLinkedList}
     */
    @Test
    void testConstructor() {
        assertEquals(0, (new CircularLinkedList<>()).getSize());
    }

    @Test
    void testConstructor2() {
        assertEquals(0, (new CircularLinkedList<>()).getSize());
    }
    @Test
    void testConstructor3() {
        assertEquals(0, (new CircularLinkedList<>()).getSize());
    }


    /**
     * Method under test: {@link CircularLinkedList#toString()}
     */
    @Test
    void testToString2() {
        CircularLinkedList<Object> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.append("56");
        assertEquals("[ 56 ]", circularLinkedList.toString());
    }

    /**
     * Method under test: {@link CircularLinkedList#toString()}
     */
    @Test
    void testToString3() {
        CircularLinkedList<Object> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.append("68");
        circularLinkedList.append("98");
        assertEquals("[ 68 , 98 ]", circularLinkedList.toString());
    }
}

