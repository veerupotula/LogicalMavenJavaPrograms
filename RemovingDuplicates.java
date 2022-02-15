/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.ArrayList.duplicates;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author vijay
 */
//This example demonstrates removing of duplicate elements using HashSet datastructure.
public class RemovingDuplicates {

    public void removeDuplicatesInNumbList(ArrayList<Integer> numbList) {
        final ArrayList<Integer> finalList = new ArrayList<Integer>();
        if (numbList.size() > 0) {
            System.out.println("Befoe Removing duplicate the list content:: " + numbList);
            HashSet<Integer> numbSet = new HashSet<Integer>(numbList);
            for (Integer element : numbSet) {
                finalList.add(element);
            }
            System.out.println("The final List without Duplicates::" + finalList);
        }
    }

    //i have to remove the duplicates wihtout changing the order of elements in the list.
    public void removeDuplicatesInOrderInNumbList(ArrayList<Integer> numbList) {
        final ArrayList<Integer> finalList = new ArrayList<Integer>();
        System.out.println("Befoe Removing duplicate the list content:: " + numbList);
        if (numbList.size() > 0) {
            LinkedHashSet<Integer> numbSet = new LinkedHashSet<Integer>(numbList);
            for (Integer element : numbSet) {
                finalList.add(element);
            }
            System.out.println("The final List without Duplicates::" + finalList);
        }
    }

    public void removeDuplicatesInStringList(ArrayList<String> numbList) {
        final ArrayList<String> finalList = new ArrayList<String>();
        if (numbList.size() > 0) {
            System.out.println("Befoe Removing duplicate the list content:: " + numbList);
            HashSet<String> numbSet = new HashSet<String>(numbList);
            for (String element : numbSet) {
                finalList.add(element);
            }
            System.out.println("The final List without Duplicates::" + finalList);
        }
    }

    //i have to remove the duplicates wihtout changing the order of elements in the list.
    public void removeDuplicatesInOrderInStringList(ArrayList<String> numbList) {
        final ArrayList<String> finalList = new ArrayList<String>();
        System.out.println("Befoe Removing duplicate the list content:: " + numbList);
        if (numbList.size() > 0) {
            LinkedHashSet<String> numbSet = new LinkedHashSet<String>(numbList);
            for (String element : numbSet) {
                finalList.add(element);
            }
            System.out.println("The final List without Duplicates::" + finalList);
        }
    }

    public void removeDuplicatesEmpList(ArrayList<Employee> empList, EmployeeComparator empComparator) {
        if (empList.size() > 0) {
            //Collections.sort(empList, empComparator); //This is not able to remove the duplicate values. man
            TreeSet empSet = new TreeSet(empComparator);
            empSet.addAll(empList);

            System.out.println("Employee list after removing duplicates: " + empSet);

        }
    }

    public void removeEmployeeDuplicates(ArrayList<Employee> empList) {

        final ArrayList<Employee> finalList = new ArrayList<Employee>();

        for (Employee emp : empList) {
            if (!finalList.contains(emp)) {
                finalList.add(emp);
            }
        }

        System.out.println("The Final employee list::" + finalList);

        System.out.println("The Final employee list size is::" + finalList.size());

    }

    public ArrayList<Integer> getNumberList() {
        ArrayList numberList = new ArrayList();
        numberList.add(12);
        numberList.add(34);
        numberList.add(34);
        numberList.add(3);
        numberList.add(90);
        numberList.add(56);
        numberList.add(67);
        return numberList;
    }

    public ArrayList<String> getStringList() {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("G");
        stringList.add("T");
        stringList.add("T");
        stringList.add("u");
        stringList.add("R");
        stringList.add("R");
        stringList.add("E");
        stringList.add("y");
        stringList.add("r");
        return stringList;
    }

    public ArrayList<Employee> getEmployeeList() {

        ArrayList<Employee> empList = new ArrayList<Employee>();
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

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        System.out.println("The employee List::\n" + empList);
        System.out.println("The employee List size is::\n" + empList.size());

        return empList;
    }

    public ArrayList<Employee> getEmployeeListCon() {

        ArrayList<Employee> empList = new ArrayList<Employee>();
        Employee emp1 = new Employee(12);
        Employee emp2 = new Employee(12);
        Employee emp3 = new Employee(14);
        Employee emp4 = new Employee(4);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        return empList;
    }

    public static void main(String[] args) {

        RemovingDuplicates test = new RemovingDuplicates();
      //  test.getEmployeeList();

       // test.removeDuplicatesInNumbList(test.getNumberList());
       // test.removeDuplicatesInOrderInNumbList(test.getNumberList());
        test.removeDuplicatesInStringList(test.getStringList());
        //test.removeDuplicatesInOrderInStringList(test.getStringList());
       // test.removeDuplicatesEmpList(test.getEmployeeList(), new EmployeeComparator());
       // test.removeEmployeeDuplicates(test.getEmployeeList());

    }

}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        //return emp1.empno.compareTo(emp2.empno);//ascending order
        //return -emp1.empno.compareTo(emp2.empno);//descending order
        //return -emp2.empno.compareTo(emp1.empno);//asscending order
        //return emp2.empno.compareTo(emp1.empno);//desscending order
        //return -1;//reverser oder of insertion
        // return 1;//insertion order
        if (emp1.empNo == emp2.empNo) //this aint gonna working.
        {
            return 0;
        }
        return 1;

        //Based on empname we have to remove duplicates then we have to write the following logic
        /*if (emp1.getEmpName().equalsIgnoreCase(emp2.getEmpName())) {
            return 0;//removing duplicates    
        } else {
            return 1;
       }*/
    }
}

class Employee {

    int empNo;
    String empName;
    float empSal;

    public Employee() {
    }

    public Employee(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
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
        return "Employee{" + "empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + '}';
    }

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + this.empNo;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Employee other = (Employee) obj;
//        if (this.empNo != other.empNo) {
//            return false;
//        }
//        return true;
//    }
}
