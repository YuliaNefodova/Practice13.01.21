package com.company.tests;

import com.company.StringTasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTasksTest {

    StringTasks stringTasks = new StringTasks();

    @Test
    public void testGetValidString1(){

        boolean actual = stringTasks.getValidString("+380 66 777-88-00");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testGetValidString2(){

        boolean actual =  stringTasks.getValidString("+380 97 222 21 22");
        boolean expected = true;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void validNumberTest3(){

        boolean actual =  stringTasks.getValidString("+380978881188");
        boolean expected = false;

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void testCheckHex() {
        String string = "AA";

        boolean actual = stringTasks.checkHex(string);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void isHexTestFalse() {

        String string = "XX";

        boolean actual = stringTasks.checkHex(string);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

}
