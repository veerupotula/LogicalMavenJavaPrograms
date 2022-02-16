/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author vijay
 */
public class FindingAndRemoveDuplicatesCollections {
     public ArrayList<Integer> FindingDuplicates(int[] numbArr) {
        HashSet<Integer> intSet = new HashSet<>();
        ArrayList<Integer> duplicateList = new ArrayList<Integer>();

        if (numbArr.length > 0) {
            for (int element : numbArr) {
                if (intSet.add(element) == false) {
                    duplicateList.add(element);
                    System.out.println("The duplicate element is:" + element);
                }
            }
        }
        System.out.println("The duplicates list::" + duplicateList.toString());
        return duplicateList;
    }

    public ArrayList<String> FindingDuplicates(String[] numbArr) {
        HashSet<String> intSet = new HashSet<>();
        ArrayList<String> duplicateList = new ArrayList<String>();

        if (numbArr.length > 0) {
            for (String element : numbArr) {
                if (intSet.add(element) == false) {
                    duplicateList.add(element);
                    System.out.println("The duplicate element is:" + element);
                }
            }
        }
        System.out.println("The duplicates list::" + duplicateList.toString());
        return duplicateList;
    }
    
     public static void main(String[] args) {

        FindingAndRemoveDuplicatesCollections obj = new FindingAndRemoveDuplicatesCollections();
        //obj.maxAndMin(new int[]{12,5,3,13,67,34});

       // obj.FindingDuplicates(new int[]{12,5,3,13,13,45,12,67,34});
       // obj.FindingDuplicates(new String[]{"vijay", "vijay", "gopal", "gopal"});
        //obj.sortAscAndRemoveDuplicatesArray(new int[]{12,5,3,13,13,45,12,67,34});
        //obj.sortAscAndRemoveDuplicatesArray(new String[]{"vijay", "vijay", "gopal", "gopal"});
        //obj.sortAscArray(new int[]{12, 5, 3, 13,12,12, 45, 67, 34});
        //obj.sortAscArray(new String[]{"A", "Z", "p", "Q"});
        //obj.sortDescArray(new Integer[]{12, 5, 3, 13, 45, 67, 34},new IntComparator());
        //obj.sortDescArray(new String[]{"A", "Z", "p", "Q"},new StringComparator());
        //obj.findingInt(new int[]{12, 5, 3, 13, 45, 67, 34}, 3);

    }
     
}
