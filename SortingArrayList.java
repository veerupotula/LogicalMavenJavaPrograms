/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.ArrayList.sorting;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author vijay
 */
public class SortingArrayList {

    public void sortAscNumList(ArrayList<Integer> numbList) {
        if (numbList.size() > 0) {
            Collections.sort(numbList);
            System.out.println("After sorting the list is in asc order: " + numbList);

        }
    }

    public void sortDescNumList(ArrayList<Integer> numbList, IntComparator intComparator) {
        if (numbList.size() > 0) {
            Collections.sort(numbList, intComparator);
            System.out.println("After sorting the list is in desc order: " + numbList);

        }
    }

    public void sortAscStringList(List<String> stringList) {
        if (stringList.size() > 0) {
            Collections.sort(stringList);
            System.out.println("After sorting the list is in asc order:" + stringList);

        }
    }


    public void sortDescStringList(ArrayList<String> stringList, StringComparator stringComparator) {
        if (stringList.size() > 0) {
            Collections.sort(stringList, stringComparator);
            System.out.println("After sorting the list is in desc order: " + stringList);

        }
    }

    public void reverseNumbList(ArrayList<Integer> numbList, IntComparator intComparator) {
        if (numbList.size() > 0) {
            //Collections.sort(numbList, intComparator);//or we can use the following method
            Collections.reverse(numbList);;
            System.out.println("reversing order list is: " + numbList);

        }
    }

    public void reverseStringList(ArrayList<String> stringList, StringComparator stringComparator) {
        if (stringList.size() > 0) {
            //Collections.sort(stringList, stringComparator);//or we can use the following method
            Collections.reverse(stringList);
            System.out.println("reversing order list is: " + stringList);

        }
    }
    
    public void reverseStringListWithoutComparator(ArrayList<String> stringList) {
        if (stringList.size() > 0) {
            //Collections.sort(stringList, stringComparator);//or we can use the following method
            Collections.reverse(stringList);
            System.out.println("reversing order list is: " + stringList);

        }
    }
    

    
    public void sortAscEmpList(ArrayList<Employee> empList, EmployeeComparator empComparator) {
        if (empList.size() > 0) {
            Collections.sort(empList, empComparator);
            System.out.println("Employee sorting the list in Asc: " + empList);

        }
    }

    public void sortDescEmpList(ArrayList<Employee> empList, EmployeeComparator empComparator) {
        if (empList.size() > 0) {
            Collections.sort(empList, empComparator);
            System.out.println("Employee sorting the list in Asc: " + empList);

        }
    }
    
    
    
    public List<Employee> getEmployeeList() {

        ArrayList<Employee> empSet = new ArrayList<Employee>();
        Employee emp1 = new Employee();
        emp1.setEmpNo(12);
        emp1.setEmpName("vijay");
        emp1.setEmpSal(12000.99f);

        Employee emp2 = new Employee();
        emp2.setEmpNo(5);
        emp2.setEmpName("gopal");
        emp2.setEmpSal(34344.344f);

        Employee emp3 = new Employee();
        emp3.setEmpNo(12);
        emp3.setEmpName("naresh");
        emp3.setEmpSal(23234.344f);

        Employee emp4 = new Employee();
        emp4.setEmpNo(12);
        emp4.setEmpName("naresh");
        emp4.setEmpSal(23234.344f);

        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        System.out.println("Employee set::" + empSet);
        return empSet;
    }
    
    
    public static void main(String[] args) {

        ArrayList numberList = new ArrayList();
        numberList.add(12);
        numberList.add(34);
        numberList.add(34);
        numberList.add(3);
        numberList.add(90);
        numberList.add(56);
        numberList.add(67);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("G");
        stringList.add("T");
        stringList.add("u");
        stringList.add("R");
        stringList.add("E");
        stringList.add("y");

        SortingArrayList test = new SortingArrayList();
        //test.sortAscNumList(numberList);
        // test.sortAscStringList(stringList);

        //test.sortDescNumList(numberList, new IntComparator());
        //test.sortDescStringList(stringList, new StringComparator());
        //test.reverseNumbList(numberList, new IntComparator());
        //test.reverseStringList(stringList, new StringComparator());
        test.reverseStringListWithoutComparator(stringList);
        
    }

}

class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1.compareTo(o2); //ascending order
        //return -o1.compareTo(o2);  //descending order
        //return -o2.compareTo(o1);//ascending order
        //return o2.compareTo(o1);//descending order
        return -1; //reverse order
        
//        if(o1.intValue()==o2.intValue())
//        return 0;
//        else
//            return 1; //This logic is not going to work out in the case of arraylist.
        
        
    }

}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //return o1.compareTo(o2); //ascending order
        //return -o1.compareTo(o2);  //descending order
        //return -o2.compareTo(o1);//ascending order
        //return o2.compareTo(o1);//descending order
        return -1; //reverse order
    }

}



class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        //return emp1.empNo.compareTo(emp2.empNo);//ascending order
        //return -emp1.empNo.compareTo(emp2.empNo);//descending order
        //return -emp2.empNo.compareTo(emp1.empNo);//asscending order
        //return emp2.empNo.compareTo(emp1.empNo);//desscending order
        //return -1;//reverser oder of insertion
        return 1;//insertion order

    }
}


class Employee {

    int empNo;
    String empName;
    float empSal;

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empno) {
        this.empNo = empno;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSal() {
        return empSal;
    }

    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" + "empno=" + empNo + ", empName=" + empName + ", empSal=" + empSal + '}';
    }

}