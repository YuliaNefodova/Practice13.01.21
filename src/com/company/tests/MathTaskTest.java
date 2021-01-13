package com.company.tests;

import com.company.MathTask;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class MathTaskTest {

    MathTask mathTask = new MathTask();

    @Test
    public void testSortingArray1() {

        int[] array = {3, 6, 9, 4, 7, 5};
        int[] actual = mathTask.sortingArray(array);
        int[] expected = {3, 4, 5, 6, 7, 9};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void testSortingArray2() {

        int[] array = {3, -6, 9, 4, 7, 5};
        int[] actual = mathTask.sortingArray(array);
        int[] expected = {-6, 3, 4, 5, 7, 9};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));


    }

    @Test
    public void testSortingArray3() {

        int[] array = {3, -6, 0, 4, 7, 5};
        int[] actual = mathTask.sortingArray(array);
        int[] expected = {-6, 0, 5, 4, 5, 7};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    public void changeBitToNullTest(){

        long actual = mathTask.getBitZero(11,3);
        long expected = 10;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void changeBitToNullSameValueTest(){
        long actual = mathTask.getBitZero(11,1);
        long expected = 11;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void changeBitToNULLTest(){
        long actual = mathTask.getBitZero(0,11);
        long expected = 0;
        Assertions.assertEquals(expected,actual);
    }


}