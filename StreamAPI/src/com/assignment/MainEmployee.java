package com.assignment;

import java.util.Arrays;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Harish", 50000, 101),
            new Employee("Sagar", 60000, 102),
            new Employee("Omkar", 45000, 103),
            new Employee("Frank", 55000, 104),
            new Employee("Sid", 48000, 105)
        };
        
        double[] salaries = Arrays.stream(employees)
                                  .mapToDouble(Employee::getSalary)
                                  .toArray();
        
        bubbleSort(salaries);
        
        System.out.println("Sorted salaries:");
        Arrays.stream(salaries).forEach(System.out::println);
        
        int[] ids = Arrays.stream(employees)
                          .mapToInt(Employee::getId)
                          .toArray();
        
        bubbleSort(ids);
        
        System.out.println("Sorted IDs:");
        Arrays.stream(ids).forEach(System.out::println);
    }
    
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

