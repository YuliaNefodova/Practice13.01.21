package com.company;

import java.math.BigInteger;

public class MathTask {

    public int[] sortingArray(int[] array) { //task 1

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public long getBitZero(long number, int position) { //task 7

        String binary = Long.toBinaryString(number);

        char[] oneAndZero = binary.toCharArray();
        if (number == 0) {
            return 0;
        } else if ((position > binary.length() - 1)) {
            return number;
        }

        oneAndZero[position] = '0';
        return new BigInteger(String.valueOf(oneAndZero), 2).longValue();

    }

    public long getBitOne(long number, int position) { //Task 6

        String binary = Long.toBinaryString(number);

        char[] oneAndZero = binary.toCharArray();
        if (number == 0) {
            return 0;
        } else if ((position > binary.length() - 1)) {
            return number;
        }

        oneAndZero[position] = '1';
        return new BigInteger(String.valueOf(oneAndZero), 2).longValue();
    }


    public long getBitInvert(long number, int position) {  //task 8

        String binary = Long.toBinaryString(number);
        char[] oneAndZero = binary.toCharArray();

        if (number == 0) {
            return 0;
        } else if ((position > binary.length() - 1)) {
            return number;
        }
        if (oneAndZero[position] == '0') {
            oneAndZero[position] = '1';
        } else {
            oneAndZero[position] = '0';
        }
        return new BigInteger(String.valueOf(oneAndZero), 2).longValue();
    }

}
