package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        //removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null || arr.length == 0) {
            return arr;
        }
        int index = 0;
        int count = 0;
        while (index < arr.length) {
            if (arr[index] < 1000) {
                count++;
            }
            index++;
        }
        int[] newArr = new int[count];

        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                newArr[index++] = arr[i];
            }
        }

        return newArr;
    }

}