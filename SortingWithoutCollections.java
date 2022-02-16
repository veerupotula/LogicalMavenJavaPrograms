/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.arrays;

/**
 *
 * @author vijay
 */
public class SortingWithoutCollections {
     public void bubleSort(int[] numbArray) {
        System.out.println("Before sorting number array::");
        for (int number : numbArray) {
            System.out.print(" " + number);
        }
        int arrLen = numbArray.length;
        for (int i = 0; i <= arrLen; i++) {
            for (int j = 1; j < arrLen - i; j++) {
                if (numbArray[j - 1] > numbArray[j]) {
                    int temp = 0;
                    temp = numbArray[j - 1];
                    numbArray[j - 1] = numbArray[j];
                    numbArray[j] = temp;
                }

            }
        }

        System.out.println("After soring the numbers are::");
        for (int i = 0; i < arrLen; i++) {
            System.out.print(numbArray[i]+" ");
        }

    }
     
     public static void main(String[] args) {
        
         SortingWithoutCollections test=new SortingWithoutCollections();
         test.bubleSort(new int[]{1,54,4,52,78,13});
    }
}
