package com.knoldus.linkList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SinglyLinkedListTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link SinglyLinkedList#SinglyLinkedList()}
     *   <li>{@link SinglyLinkedList#setHead(Node)}
     *   <li>{@link SinglyLinkedList#getHead()}
     *   <li>{@link SinglyLinkedList#size()}
     * </ul>
     */
    @Test
    void testConstructor() {
        SinglyLinkedList actualSinglyLinkedList = new SinglyLinkedList();
        Node node = new Node(42);
        actualSinglyLinkedList.setHead(node);
        assertSame(node, actualSinglyLinkedList.getHead());
        assertEquals(0, actualSinglyLinkedList.size());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link SinglyLinkedList#SinglyLinkedList(Node, int)}
     *   <li>{@link SinglyLinkedList#setHead(Node)}
     *   <li>{@link SinglyLinkedList#getHead()}
     *   <li>{@link SinglyLinkedList#size()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        SinglyLinkedList actualSinglyLinkedList = new SinglyLinkedList(new Node(42), 3);
        Node node = new Node(42);
        actualSinglyLinkedList.setHead(node);
        assertSame(node, actualSinglyLinkedList.getHead());
        assertEquals(3, actualSinglyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#detectLoop()}
     */
    @Test
    void testDetectLoop() {
        assertFalse((new SinglyLinkedList()).detectLoop());
        assertFalse((new SinglyLinkedList(new Node(42), 3)).detectLoop());
        assertFalse((new SinglyLinkedList(new Node(42, new Node(42)), 3)).detectLoop());
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.swapNodes(42, 42);
        assertEquals(0, singlyLinkedList.value);
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.swapNodes(1, 42);
        assertEquals(0, singlyLinkedList.value);
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.swapNodes(1, 42);
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(42, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(2);
        singlyLinkedList.swapNodes(1, 42);
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(2, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes5() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(1);
        singlyLinkedList.swapNodes(1, 42);
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(1, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes6() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertNth(1, 1);
        singlyLinkedList.swapNodes(1, 42);
        Node head = singlyLinkedList.getHead();
        assertEquals(1, head.value);
        Node node = head.next;
        assertNull(node.next);
        assertEquals(42, node.value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#swapNodes(int, int)}
     */
    @Test
    void testSwapNodes7() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertHead(1);
        singlyLinkedList.swapNodes(1, 42);
        Node head = singlyLinkedList.getHead();
        assertEquals(42, head.value);
        Node node = head.next;
        assertNull(node.next);
        assertEquals(1, node.value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#reverseList(Node)}
     */
    @Test
    void testReverseList3() {
        Node node = new Node(42);
        Node actualReverseListResult = (new SinglyLinkedList(node, 3)).reverseList(null);
        assertSame(node, actualReverseListResult);
        assertNull(actualReverseListResult.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#clear()}
     */
    @Test
    void testClear() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.clear();
        assertNull(singlyLinkedList.getHead());
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#clear()}
     */
    @Test
    void testClear2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.clear();
        assertNull(singlyLinkedList.getHead());
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#isEmpty()}
     */
    @Test
    void testIsEmpty() {
        assertTrue((new SinglyLinkedList()).isEmpty());
        assertFalse((new SinglyLinkedList(new Node(42), 3)).isEmpty());
    }

    /**
     * Method under test: {@link SinglyLinkedList#count()}
     */
    @Test
    void testCount() {
        assertEquals(0, (new SinglyLinkedList()).count());
        assertEquals(1, (new SinglyLinkedList(new Node(42), 3)).count());
    }

    /**
     * Method under test: {@link SinglyLinkedList#search(int)}
     */
    @Test
    void testSearch() {
        assertFalse((new SinglyLinkedList()).search(1));
        assertFalse((new SinglyLinkedList(new Node(42), 3)).search(1));
    }

    /**
     * Method under test: {@link SinglyLinkedList#search(int)}
     */
    @Test
    void testSearch2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(1);
        assertTrue(singlyLinkedList.search(1));
    }

    /**
     * Method under test: {@link SinglyLinkedList#toString()}
     */
    @Test
    void testToString() {
        assertEquals("", (new SinglyLinkedList()).toString());
        assertEquals("42", (new SinglyLinkedList(new Node(42), 3)).toString());
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteDuplicates()}
     */
    @Test
    void testDeleteDuplicates() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.deleteDuplicates();
        assertEquals(0, singlyLinkedList.value);
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteDuplicates()}
     */
    @Test
    void testDeleteDuplicates2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.deleteDuplicates();
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(42, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteDuplicates()}
     */
    @Test
    void testDeleteDuplicates3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42, new Node(42)), 3);
        singlyLinkedList.deleteDuplicates();
        assertNull(singlyLinkedList.getHead().next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteDuplicates()}
     */
    @Test
    void testDeleteDuplicates4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertHead(2);
        singlyLinkedList.deleteDuplicates();
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(2, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteDuplicates()}
     */
    @Test
    void testDeleteDuplicates5() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertHead(2);
        singlyLinkedList.insertHead(2);
        singlyLinkedList.deleteDuplicates();
        assertNull(singlyLinkedList.getHead().next.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#print()}
     */
    @Test
    void testPrint() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.print();
        assertEquals(0, singlyLinkedList.value);
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#print()}
     */
    @Test
    void testPrint2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.print();
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(42, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#print()}
     */
    @Test
    void testPrint3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42, new Node(42)), 3);
        singlyLinkedList.print();
        assertEquals(0, singlyLinkedList.value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(42, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insertHead(int)}
     */
    @Test
    void testInsertHead() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(2);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(2, head.value);
        assertNull(head.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insertHead(int)}
     */
    @Test
    void testInsertHead2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertHead(2);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(2, head.value);
        assertNull(head.next.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insert(int)}
     */
    @Test
    void testInsert() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(1);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(1, head.value);
        assertNull(head.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insert(int)}
     */
    @Test
    void testInsert3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(2);
        singlyLinkedList.insert(1);
        assertFalse(singlyLinkedList.isEmpty());
        Node node = singlyLinkedList.getHead().next;
        assertNull(node.next);
        assertEquals(1, node.value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insert(int)}
     */
    @Test
    void testInsert4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.setHead(new Node(42));
        singlyLinkedList.insert(1);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(1, head.value);
        assertNull(head.next.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insertNth(int, int)}
     */
    @Test
    void testInsertNth2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertNth(1, 0);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(1, head.value);
        assertNull(head.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#insertNth(int, int)}
     */
    @Test
    void testInsertNth3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertNth(1, 1);
        assertFalse(singlyLinkedList.isEmpty());
        Node node = singlyLinkedList.getHead().next;
        assertNull(node.next);
        assertEquals(1, node.value);
    }


    /**
     * Method under test: {@link SinglyLinkedList#insertNth(int, int)}
     */
    @Test
    void testInsertNth6() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.insertNth(1, 0);
        assertFalse(singlyLinkedList.isEmpty());
        Node head = singlyLinkedList.getHead();
        assertEquals(1, head.value);
        assertNull(head.next.next);
    }

    /**
     * Method under test: {@link SinglyLinkedList#deleteHead()}
     */
    @Test
    void testDeleteHead2() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42), 3);
        singlyLinkedList.deleteHead();
        assertNull(singlyLinkedList.getHead());
        assertEquals(2, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#delete()}
     */
    @Test
    void testDelete3() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(2);
        singlyLinkedList.delete();
        assertNull(singlyLinkedList.getHead());
        assertEquals(0, singlyLinkedList.size());
    }

    /**
     * Method under test: {@link SinglyLinkedList#delete()}
     */
    @Test
    void testDelete4() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(2);
        singlyLinkedList.insertHead(2);
        singlyLinkedList.delete();
        assertFalse(singlyLinkedList.isEmpty());
        assertNull(singlyLinkedList.getHead().next);
    }


    /**
     * Method under test: {@link SinglyLinkedList#deleteNth(int)}
     */
    @Test
    void testDeleteNth5() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42, new Node(42)), 3);
        singlyLinkedList.deleteNth(1);
        assertFalse(singlyLinkedList.isEmpty());
        assertNull(singlyLinkedList.getHead().next);
    }


    /**
     * Method under test: {@link SinglyLinkedList#deleteNth(int)}
     */
    @Test
    void testDeleteNth7() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(new Node(42, new Node(42)), 3);
        singlyLinkedList.deleteNth(0);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(42, singlyLinkedList.getHead().value);
    }

    /**
     * Method under test: {@link SinglyLinkedList#getNth(int)}
     */
    @Test
    void testGetNth5() {
        assertEquals(42, (new SinglyLinkedList(new Node(42, new Node(42)), 3)).getNth(1));
    }

    /**
     * Method under test: {@link SinglyLinkedList#checkBounds(int, int, int)}
     */
    @Test
    void testCheckBounds() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.checkBounds(1, 1, 1);
        assertEquals(0, singlyLinkedList.value);
        assertEquals(0, singlyLinkedList.size());
    }

}

