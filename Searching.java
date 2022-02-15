/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.ArrayList.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vijay
 */
public class Searching {
 
    //working as we expected.
    public boolean isElementFound(Object obj) {
        boolean isElementFound = false;
        List list = new ArrayList();
        list.add(12);
        list.add(1);
        list.add(15);
        list.add(17);
        if (list.contains(obj)) {
            isElementFound = true;
            
        }
        System.out.println("is Element"+obj+" found::"+isElementFound);
        if(isElementFound)
        {
            int index=list.indexOf(obj);
            System.out.println("The element"+obj+" was found at the index::"+index);
        }
        return isElementFound;
    }
    
    //before doing this binary search operation,the list should be sorted and comparable and should be homogenious.
    //if the element found then it will return the index other wise it will return the back track index of the next element
    public int isElementFound(Integer searchElement)
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(12);
        list.add(1);
        list.add(14);
        list.add(19);
        Collections.sort(list);
        int index=Collections.binarySearch(list, searchElement);
        System.out.println("The element was found at at the index::"+index);
        return index;
    }
    
    
    public static void main(String[] args) {
        Searching searching=new Searching();
        
        //searching.isElementFound(1);
        searching.isElementFound(18);//-4//for example the next element to 18 was 19. so 19 element backtrack index will be return.
        searching.isElementFound(20); //-5 //Here 20 was not present in the list.        
        searching.isElementFound(100);//-5 the only backtrack index after the 19 elment.
        searching.isElementFound(-100);//-1 back track index before 1 element
        
    }
    
}
