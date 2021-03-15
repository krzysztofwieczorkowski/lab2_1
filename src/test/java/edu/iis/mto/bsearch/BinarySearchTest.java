package edu.iis.mto.bsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BinarySearchTest {

    @BeforeEach
    void setUp() throws Exception {}

    @Test
    void test1() {
        int[] array={5};
        SearchResult res = BinarySearch.search(5,array);
        assertEquals(res.isFound(),true);
    }
    @Test
    void test2() {
        int[] array={15};
        SearchResult res = BinarySearch.search(5,array);
        assertEquals(res.isFound(),false);
    }
    @Test
    void test3() {
        int[] array={2,4,6,8,10,12};
        SearchResult res = BinarySearch.search(2,array);
        assertEquals(res.getPosition(),1);
    }
    @Test
    void test4() {
        int[] array={3,6,9,12,15,18};
        SearchResult res = BinarySearch.search(18,array);
        assertEquals(res.getPosition(),6);
    }
    @Test
    void test5() {
        int[] array={4,8,12,16,20};
        SearchResult res = BinarySearch.search(12,array);
        assertEquals(res.getPosition(),3);
    }
    @Test
    void test6() {
        int[] array={3,5,18,24,85,148};
        SearchResult res = BinarySearch.search(2,array);
        assertEquals(res.isFound(),false);
    }


}
