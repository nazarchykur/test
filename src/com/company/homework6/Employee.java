package com.company.homework6;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    static String findEmployeeWithMaxSalary(Employee... employees) {
        int maxSalary = employees[0].getSalary();
        String employeeName = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary)
                maxSalary = employee.getSalary();
            if (employee.getSalary() == maxSalary)
                employeeName = employee.getName();
        }
        System.out.println("Employee " + employeeName + " has max salary " + maxSalary);

        return employeeName;
    }

    static int findMinSalary(Employee... employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary)
                minSalary = employee.getSalary();
        }
        return minSalary;
    }


    static String findEmployeeWithMinSalary(Employee... employees) {
        int minSalary = findMinSalary(employees);
        String employeeName = null;
        for (Employee employee : employees) {
            if (employee.getSalary() == minSalary)
                employeeName = employee.getName();
        }
        System.out.println("Employee " + employeeName + " has min salary " + minSalary);

        return employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    public static boolean checkIdenticalEmployees(Employee... employees) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            int next = i + 1;
            if (next < employees.length)
                if (employees[i].equals(employees[next]))
                    flag = true;
        }
        return flag;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.salary - employee.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
