package com.company.tests;

import com.company.BinSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinSearchTest {
    BinSearch binSearch = new BinSearch();

    @Test
    public void testBinSearchReturnIndex1(){

        int [] array = {1,2,3,4,5};
        int actual = binSearch.binSearchReturnIndex(array, 3);
        int expected = 2;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testBinSearchReturnIndex2(){

        int [] array = {1,2,3,4,5};
        int actual = binSearch.binSearchReturnIndex(array, 0);
        int expected = -1;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testBinSearchReturnIndex3(){

        int [] array = {1,2,3,4,5};
        int actual = binSearch.binSearchReturnIndex(array, 5);
        int expected = 4;

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testBinSearchReturnArray1(){

        int [] array = {1,2,3,4,5};
        String actual = binSearch.binSearchReturnArray(array, 3);
        String expected = Arrays.toString(new int[]{2});

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testBinSearchReturnArray2(){

        int [] array = {1,2,3,4,5};
        String actual = binSearch.binSearchReturnArray(array, 0);
        String expected = Arrays.toString(new int[]{2});

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void testBinSearchReturnArray3(){

        int [] array = {1,2,3,4,5};
        String actual = binSearch.binSearchReturnArray(array, 5);
        String expected = Arrays.toString(new int[]{3});

        Assertions.assertEquals(expected,actual);

    }

}
