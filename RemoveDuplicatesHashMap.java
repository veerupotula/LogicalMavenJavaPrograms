/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vijay.hashmap.removeduplicates;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


import java.util.TreeMap;

/**
 *
 * @author vijay
 */
public class RemoveDuplicatesHashMap {

    //By default while adding integers or strings as key to hashmap,the duplicates will be removed automatically
    //But if we add a customized class object as a key to hashmap these objects wont be removed automatically assume we have not override equals and hashcode method.
    //if we override equals and hashcode in a customized class then while adding to hashmap the duplicates will be removed automatically.
    
    
    public void removeDuplicatesEmpMapUsingComparator(Map<Employee, String> empMap, EmployeeComparator empComparator) {
        System.out.println("Before removing duplicates employee map::" + empMap);

        TreeMap treeMap = new TreeMap(empComparator);
        treeMap.putAll(empMap);

        System.out.println("After removing duplicates TreeMap content:\n" + treeMap);
    }

    public Map<Employee, String> getEmployeeMap() {

        HashMap<Employee, String> empMap = new HashMap<Employee, String>();
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
        emp4.setEmpSal(6767.344f);

        empMap.put(emp1, "vijay");
        empMap.put(emp2, "vijay");
        empMap.put(emp3, "vijay");
        empMap.put(emp4, "vijay");

        System.out.println("Employee HashMap::" + empMap);

        return empMap;
    }

    public Map<EmployeeWithOverride, String> removeDuplicatesWithoutComparator() {

        HashMap<EmployeeWithOverride, String> empMap = new HashMap<EmployeeWithOverride, String>();
        EmployeeWithOverride emp1 = new EmployeeWithOverride();
        emp1.setEmpNo(12);
        emp1.setEmpName("vijay");
        emp1.setEmpSal(12000.99f);

        EmployeeWithOverride emp2 = new EmployeeWithOverride();
        emp2.setEmpNo(5);
        emp2.setEmpName("gopal");
        emp2.setEmpSal(34344.344f);

        EmployeeWithOverride emp3 = new EmployeeWithOverride();
        emp3.setEmpNo(12);
        emp3.setEmpName("naresh");
        emp3.setEmpSal(23234.344f);

        EmployeeWithOverride emp4 = new EmployeeWithOverride();
        emp4.setEmpNo(12);
        emp4.setEmpName("naresh");
        emp4.setEmpSal(6767.344f);

        empMap.put(emp1, "vijay");
        empMap.put(emp2, "vijay");
        empMap.put(emp3, "vijay");
        empMap.put(emp4, "vijay");

        System.out.println("EmployeeWithOverride HashMap::" + empMap);

        return empMap;
    }

    public static void main(String[] args) {

        RemoveDuplicatesHashMap test = new RemoveDuplicatesHashMap();
        test.removeDuplicatesEmpMapUsingComparator(test.getEmployeeMap(), new EmployeeComparator());
        test.removeDuplicatesWithoutComparator();

    }
}

class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {

        //return emp1.empNo.compareTo(emp2.empNo);//ascending order
        //return -emp1.empno.compareTo(emp2.empno);//descending order
        //return -emp2.empno.compareTo(emp1.empno);//asscending order
        //return emp2.empno.compareTo(emp1.empno);//desscending order
        //return -1;//reverser oder of insertion
        // return 1;//insertion order
        if (emp1.empNo.equals(emp2.empNo)) {
            return 0;
        }
        return 1;

        //Based on empname we have to remove duplicates then we have to write the following logic
//        if (emp1.getEmpName().equalsIgnoreCase(emp2.getEmpName())) {
//            return 0;//removing duplicates    
//        } else {
//            return 1;
//        }
    }
}

class Employee {

    Integer empNo;
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

}

class EmployeeWithOverride {

    Integer empNo;
    String empName;
    float empSal;

    public EmployeeWithOverride() {
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.empNo != null ? this.empNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmployeeWithOverride other = (EmployeeWithOverride) obj;
        if (this.empNo != other.empNo && (this.empNo == null || !this.empNo.equals(other.empNo))) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return "Employee{" + "empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + '}';
    }

}
