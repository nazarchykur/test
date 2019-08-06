package com.company.h3;

public class Homework3_2 {
    /*
Create an array of 10 integers. Display
    - the biggest of these numbers;
    - the sum of positive numbers in the array;
    - the amount of negative and positive numbers in the array.
    What values there are more: negative or positive?
*/

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 8, 9, -6, -7, -5, 4, 10};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Maximum value:" + max);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("sum:" + sum);

        int amountOfNegativeNumbers = 0;
        int amountOfPositiveNumbers = 0;
        for (int i1 : array) {
            if (i1 > 0) {
                amountOfPositiveNumbers += 1;
            }
            if (i1 < 0) {
                amountOfNegativeNumbers += 1;
            }

        }
        System.out.println("amount Of Positive Numbers is : " + amountOfPositiveNumbers);
        System.out.println("amount Of Negative Numbers is : " + amountOfNegativeNumbers);
        if (amountOfPositiveNumbers > amountOfNegativeNumbers)
            System.out.println("amount Of Positive Numbers more then Negative");
        else if (amountOfPositiveNumbers < amountOfNegativeNumbers)
            System.out.println("amount Of Negative Numbers more then Positive");
        else
            System.out.println("amount Of Negative amd Positive Numbers are equal");
    }
}

