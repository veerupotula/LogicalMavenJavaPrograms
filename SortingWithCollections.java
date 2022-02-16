/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author vijay
 */
public class SortingWithCollections {
    

    public void sortAscIntArray(int[] numbArr) {

        if (numbArr.length > 0) {
            System.out.println("Before sorting Array Contents:::");
            for (int element : numbArr) {
                System.out.print(element + " ");
            }
            //12 5 3 13 12 12 45 67 34
            Arrays.sort(numbArr);

            System.out.println("After sorting in asc Array Contents::");
            for (int element : numbArr) {
                System.out.print(element + " ");
            }
            //3 5 12 12 12 13 34 45 67
        }

    }

    public void sortAscStringArray(String[] strArr) {
        ArrayList<String> sortedList = new ArrayList<String>();
        if (strArr.length > 0) {
            Arrays.sort(strArr);
            for (String element : strArr) {
                sortedList.add(element);
                System.out.println(element);
            }

            System.out.println("The sorted List:" + sortedList);
        }

    }

    public void sortDescIntegerArray(Integer[] numbArr, IntComparator intComparator) {

        if (numbArr.length > 0) {

            System.out.println("Before sorting the number array contents::");
            for (Integer element : numbArr) {
                System.out.print(element + " ");
            }
            //12 5 3 13 45 67 34 
            Arrays.sort(numbArr, intComparator); //both the arguements should be Integer type: it never accepts first arguement as primitive type like int[]

            System.out.println("After sorting the elements in the number array::");
            for (Integer element : numbArr) {
                System.out.print(element + " ");
            }
            //67 45 34 13 12 5 3

        }

    }

    public void sortDescStringArray(String[] stringArr, StringComparator stringComparator) {
        ArrayList<String> sortedList = new ArrayList<String>();
        if (stringArr.length > 0) {
            Arrays.sort(stringArr, stringComparator); //both the arguements should be Integer type: it never accepts first arguement as primitive type like int[]
            for (String element : stringArr) {
                sortedList.add(element);
                System.out.println(element);
            }

            System.out.println("The descending sorted List:" + sortedList);
        }

    }

    //insertion order preserverd
    //removed duplicates
    //order wise elements all in one one single shot.
    public void sortAscAndRemoveDuplicatesIntegerArray(Integer[] numbArr, IntComparator intComparator) {
//        LinkedHashSet<Integer> sortedNoDupList = new LinkedHashSet<Integer>();
//        if (numbArr.length > 0) {
//            Arrays.sort(numbArr);
//            for (int element : numbArr) {
//                sortedNoDupList.add(element);
//                System.out.println(element);
//            }
//
//            System.out.println("without duplicates and sorted List:" + sortedNoDupList);
//        }

         System.out.println("Before sorting the number array contents::");
            for (Integer element : numbArr) {
                System.out.print(element + " ");
            }
            //12 5 3 13 13 45 12 67 34
        
        Arrays.sort(numbArr,intComparator);
        
         System.out.println("After sorting and removing duplicates., the elements in the number array::");
            for (Integer element : numbArr) {
                System.out.print(element + " ");
            }
            //3 5 12 12 13 13 34 45 67
        
        
        
    }

    public void sortAscAndRemoveDuplicatesStringArray(String[] numbArr) {
        LinkedHashSet<String> sortedNoDupSet = new LinkedHashSet<String>();
        if (numbArr.length > 0) {
            Arrays.sort(numbArr);
            for (String element : numbArr) {
                sortedNoDupSet.add(element);
                System.out.println(element);
            }
            
            System.out.println("without duplicates and sorted Set:" + sortedNoDupSet);
        }

    }
    
    
    public int searchInt(int[] numbArray, int key) {
        if (numbArray.length > 0) {
            int indexPosition = Arrays.binarySearch(numbArray, key);
            System.out.println("The number present in array at index:" + indexPosition);
            return indexPosition;
        }
        return 0;
    }
    
     public int sortAndsearchInt(int[] numbArray, int key) {
        if (numbArray.length > 0) {
            Arrays.sort(numbArray);
            System.out.println("After sorting: Elements in array::");
            for (int element : numbArray) {
                System.out.println(element);
            }

            int indexPosition = Arrays.binarySearch(numbArray, key);
            System.out.println("The number present in array at index:" + indexPosition);
            return indexPosition;
        }
        return 0;
    }

      
    
    public void reverse(int[] numb) {
        Integer[] numb1 = {12, 56, 34, 23};
        //there is no reverse method in Arrays class

        List numbList = Arrays.asList(numb1);
        Collections.reverse(numbList);
        System.out.println("After reversing: Elements in arraylist::" + numbList);

        
        //here if we want we can directly print the contents but we do so.it will print the array reference. it cant print the arraylist style printing.why because here we are referring the array content with arraylist.
        for (Object element : numbList) {
            System.out.println(element);
        }

    }
    
    public void minAndMaxUsingCollections(Integer[] numArr) {
        //if we pass int[] as arguement here then we would get an compile time error saying collections.min method.
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

    }
      
     public static void main(String[] args) {

        SortingWithCollections obj = new SortingWithCollections();
        //obj.maxAndMin(new int[]{12,5,3,13,67,34});

        //obj.FindingDuplicates(new int[]{12,5,3,13,13,45,12,67,34});
        //obj.FindingDuplicates(new String[]{"vijay", "vijay", "gopal", "gopal"});
        obj.sortAscAndRemoveDuplicatesIntegerArray(new Integer[]{12,5,3,13,13,45,12,67,34},new IntComparator());
        //obj.sortAscAndRemoveDuplicatesArray(new String[]{"vijay", "vijay", "gopal", "gopal"});
        //obj.sortAscArray(new int[]{12, 5, 3, 13,12,12, 45, 67, 34});
        //obj.sortAscArray(new String[]{"A", "Z", "p", "Q"});
        //obj.sortDescIntegerArray(new Integer[]{12, 5, 3, 13, 45, 67, 34},new IntComparator());
        //obj.sortDescArray(new String[]{"A", "Z", "p", "Q"},new StringComparator());
        //obj.searchInt(new int[]{12, 5, 3, 13, 45, 67, 34}, 3);

    }
}



class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        //return o1.compareTo(o2);//ascending order
        //return -o1.compareTo(o2);//descending order
        
        if(o1.equals(o2))
        {
            return 0;
        }
        return o1.compareTo(o2);

    }

}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        //return o1.compareTo(o2);//ascending order
        return -o1.compareTo(o2);//descending order

    }

}

