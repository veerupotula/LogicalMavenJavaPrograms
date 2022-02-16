/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/**
 *
 * @author vijay
 */
public class WithoutCollections {

    //working for both the odd length array or even length array.
    //with out using any other collection or another array these reverse processing is happens.
    public void reverseArrayWithoutAPI() {
        int array[] = new int[]{1, 2, 3, 4, 5, 6};

        int totalLength = array.length - 1;
        int halfNumber = array.length / 2;

        int temp = 0;

        System.out.println("Before sort element contents are::");
        for (int element : array) {
            System.out.println(element);
        }

        for (int i = 0; i < halfNumber; i++) {
            System.out.println("iteration no::" + i);
            temp = 0;
            temp = array[i];
            array[i] = array[totalLength - i];
            array[totalLength - i] = temp;
        }

        System.out.println("Finally array details are::");
        for (int element : array) {
            System.out.println(element);
        }

    }

    //here one more array is used to reverse the elements in the array.
    public void reverseWithoutUsingCollections(int[] numb) {
        int[] numb1 = {12, 56, 34, 23};
        System.out.println("The contents in the first list");
        for (int element : numb1) {
            System.out.println(element + ",");
        }

        //there is no reverse method in Arrays class
        int[] secondList = new int[numb1.length];
        for (int index = numb1.length - 1, j = 0; index >= 0; index--, j++) {
            secondList[j] = numb1[index];
        }

        System.out.println("The contents in the second list::");
        for (int element : secondList) {
            System.out.println(element);
        }

    }

    //with out using collections.
    public void maxAndMin(int[] numArr) {  //12,5,3,13,67,34
        if (numArr.length > 0) {
            int max = numArr[0]; //12,13,67,
            int min = numArr[0]; // 5,3,

            for (int element : numArr) {
                if (max < element) {
                    max = element;
                } else if (min > element) {
                    min = element;
                }
            }
            System.out.println("MIN:" + min + "  max::" + max);
        }
    }

    /**
     * Java method to find missing number in array of size n containing numbers
     * from 1 to n only. can be used to find missing elements on integer array
     * of numbers from 1 to 100 or 1 - 1000
     */
    //in order to work out this method ..the elements in the array should be contigenous. should not be a random numbers.
    public int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1));
        expectedSum /= 2;
        System.out.println("Expected sum::" + expectedSum);

        int actualSum = 0;
        for (int element : numbers) {
            actualSum += element;
        }
        System.out.println("The actual sum::" + actualSum);
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is::" + missingNumber);
        return missingNumber;
        ////Read more: http://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz4AQCku9Qa
    }

    /**
     * * A general method to find missing values from an integer array in Java.
     * * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

//Read more: http://javarevisited.blogspot.com/2014/11/how-to-find-missing-number-on-integer-array-java.html#ixzz4AQDyE670
    public void findUpperAndLowerBound(String[][] data1) {
        String[][] data = new String[2][5];
        System.out.println("Dimension 1: " + data.length);
        System.out.println("Dimension 2: " + data[0].length);
    }

    public void mergeTwoArrays() {
        Integer[] list1 = {12, 67, 34, 90};
        Integer[] list2 = {55, 33, 22, 44};

        ArrayList mainList = new ArrayList(Arrays.asList(list1));
        mainList.addAll(Arrays.asList(list2));
        System.out.println("List Contents::" + mainList);

    }

    public void areTwoArraysEqual() {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4, 5, 6};
        int[] array3 = {1, 2, 3, 4};
        System.out.println("Is array 1 equal to array 2?? "
                + Arrays.equals(array1, array2));
        System.out.println("Is array 1 equal to array 3?? "
                + Arrays.equals(array1, array3));
    }

    public void findingCommonElementsInTwoArrays() {
        int[] arr1 = {4, 7, 3, 9, 2};
        int[] arr2 = {3, 2, 12, 9, 40, 32, 4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    //not working now...own written method
    public void removeDuplicates() {
        int array[] = new int[]{1, 2, 5, 5, 4};

        int finalArray[] = new int[array.length];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count = count + 1;
                    if (count == 2) {

                        finalArray[i] = array[i];
                        break;
                    }

                } else {

                }
            }

        }

        System.out.println("Final array contents are::");
        for (int element : finalArray) {
            System.out.println(element);
        }

    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    //working but not understand by me
    public int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together      
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }

        System.out.println("The final without duplicates list is::");
        for (int element : result) {
            System.out.println(element);
        }
        return result;

    }

    public boolean isElementFound(int[] numbArray, int searchingElement) {

        boolean isElementFound = false;

        System.out.print("Before search operation the elements in array::");
        for (int element : numbArray) {
            System.out.print(element+" ");
        }

        for (int i = 0; i < numbArray.length; i++) {
            if (numbArray[i] == searchingElement) {
                System.out.println("The element:" + searchingElement + " was found at index::" + i);
                isElementFound = true;
                break;
            }
        }

        System.out.println("is element::" + searchingElement + " found::" + isElementFound);
        return isElementFound;
    }

    public static void main(String[] args) {
        WithoutCollections obj = new WithoutCollections();
        //obj.maxAndMin(new int[]{12,5,3,13,67,34});

       // obj.getMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10}, 10);

       // obj.isElementFound(new int[]{1,3,67,23,12}, 3);
        
        //obj.FindingDuplicates(new int[]{12,5,3,13,13,45,12,67,34});
        //obj.FindingDuplicates(new String[]{"vijay", "vijay", "gopal", "gopal"});
        //obj.sortAscAndRemoveDuplicatesArray(new int[]{12,5,3,13,13,45,12,67,34});
        //obj.sortAscAndRemoveDuplicatesArray(new String[]{"vijay", "vijay", "gopal", "gopal"});
        //obj.sortAscArray(new int[]{12, 5, 3, 13,12,12, 45, 67, 34});
        //obj.sortAscArray(new String[]{"A", "Z", "p", "Q"});
        //obj.sortDescArray(new Integer[]{12, 5, 3, 13, 45, 67, 34},new IntComparator());
        //obj.sortDescArray(new String[]{"A", "Z", "p", "Q"},new StringComparator());
        //obj.findingInt(new int[]{12, 5, 3, 13, 45, 67, 34}, 3);
        //obj.minAndMaxUsingCollections(new Integer[]{12,56,12});
        //obj.reverse(new int[]{});
       // obj.reverseWithoutUsingCollections(new int[]{});
      //  obj.mergeTwoArrays();
        // obj.areTwoArraysEqual();
        obj.removeDuplicates();
        //obj.removeDuplicates(new int[]{4,4,5,5,2,2});
        //obj.reverseArrayWithoutAPI();
    }
}
