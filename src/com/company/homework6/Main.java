package com.company.homework6;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Leo", "IT", 5000);
        Employee emp2 = new Employee("Doni", "IT", 4000);
        Employee emp3 = new Employee("Miki", "IT", 6000);
        Employee emp4 = new Employee("Rafa", "IT", 8000);
        Employee emp5 = new Employee("M-Jey", "IT", 5000);
        Employee emp6 = new Employee("M-Jey", "IT", 5000);

        Employee employees[] = {emp1, emp2, emp3, emp4, emp5, emp6};


        Employee.findEmployeeWithMaxSalary(employees);
        Employee.findEmployeeWithMinSalary(employees);
        System.out.println(Employee.checkIdenticalEmployees(employees));

        System.out.println("Before sorting: " + Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("After ascending sorting: " + Arrays.toString(employees));
        Arrays.sort(employees, Collections.reverseOrder());
        System.out.println("After descending sorting: " + Arrays.toString(employees));


    }
}

