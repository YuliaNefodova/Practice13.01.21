package com.company;

import java.util.Arrays;

public class BinSearch {

    public int binSearchReturnIndex (int[] array, int key){ //task 2
    int left = 0;
    int right = array.length - 1;

    int index = -1;
        while (left <= right) {
        int mid = (left + right) / 2;
        if (array[mid] < key) {
            left = mid + 1;
        } else if (array[mid] > key) {
            right = mid - 1;
        } else if (array[mid] == key) {
            index = mid;
            break;
        }
    }
        return index;
    }


    public String binSearchReturnArray(int[] array, int key) { //task 3
        int left = 0;
        int right = array.length-1;

        int[] result = { };

        while (true) {
            int mid = (left + right) / 2;

            if (array[mid] == key) {
                result = new int[]{mid};
                return Arrays.toString(result);
            }

            if (array[mid] > key){
                right = mid;
            result = new int[]{right};
            return Arrays.toString(result);}

            else
                left = mid + 1;
            result = new int[]{left};
            return Arrays.toString(result);
        }
    }

}
