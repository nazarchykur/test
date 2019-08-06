package com.company.homework3;

public class Homework3 {

/* Enter the name of the continent. Print names of the
countries. (Declare enum with names of continents)
*/
//    enum Continents {
//        North_America,
//        South_America,
//        Africa,
//        Asia,
//        Europe,
//        Antarctica,
//        Australia
//    }
//
//    public static void main(String[] args) {
//
//        String North_America[] = {"United States", "Mexico", "Canada", "Guatemala", "Cuba", "..."};
//        String South_America[] = {"Brazil", "Colombia", "Argentina", "Peru", "Venezuela", "Chile", "Ecuador", "Bolivia", "Paraguay", "Uruguay", "..."};
//        String Africa[] = {"Nigeria", "Ethiopia", "Egypt", "Democratic Republic of the Congo", "South Africa", "Tanzania", "Kenya", "Sudan", "Algeria", "Uganda", "..."};
//        String Asia[] = {"China", "India", "Indonesia", "Pakistan", "Bangladesh", "Russia", "Japan", "Philippines", "Vietnam", "Iran", "Turkey", "Thailand", "..."};
//        String Europe[] = {"Germany", "France", "United Kingdom", "Italy", "Spain", "Ukraine", "Poland", "Romania", "Netherlands", "Belgium", "Greece", "Finland", "..."};
//        String Antarctica[] = {"Antarctica"};
//        String Australia[] = {"Australia"};
//
//        Continents continent = Continents.Europe;
//        switch (continent) {
//            case North_America:
//                System.out.println(Arrays.toString(North_America));
//                break;
//            case South_America:
//                System.out.println(Arrays.toString(South_America));
//                break;
//            case Africa:
//                System.out.println(Arrays.toString(Africa));
//                break;
//            case Asia:
//                System.out.println(Arrays.toString(Asia));
//                break;
//            case Europe:
//                System.out.println(Arrays.toString(Europe));
//                break;
//            case Antarctica:
//                System.out.println(Arrays.toString(Antarctica));
//                break;
//            case Australia:
//                System.out.println(Arrays.toString(Australia));
//                break;
//        }
//    }

    /*
     * ********************************************************************************************************
     * */

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
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                amountOfPositiveNumbers += 1;
            }
            if (array[i] < 0) {
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

