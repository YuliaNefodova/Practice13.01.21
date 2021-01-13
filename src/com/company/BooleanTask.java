package com.company;

public class BooleanTask {

    public  boolean getAllBitsSelected(long number, byte[] bitPositions){ //task 4
        String binary = Long.toBinaryString(number);
        char [] array = binary.toCharArray();
        for(int i =0;i<bitPositions.length;i++){
            if(bitPositions[i]>array.length) {
                System.out.println("Нет бита с позицией  " + bitPositions[i]);
                return false;
            }
            if(array[bitPositions[i]] !='1'){
                return false;
            }
        }
        return true;
    }


    public  boolean getAnyBitsSelected(long number, byte[] bitPositions){ //task 5
        String binary = Long.toBinaryString(number);
        char [] array = binary.toCharArray();
        for(int i =0;i<bitPositions.length;i++){
            if(bitPositions[i]>array.length){
                System.out.println("Нет бита с позицией  "+bitPositions[i]);
                return false;
            }
            if(array[bitPositions[i]] == '1'){
                return true;
            }
        }
        return false;

    }

}
