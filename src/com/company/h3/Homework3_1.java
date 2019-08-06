package com.company.h3;

import java.util.Arrays;

/* Enter the name of the continent. Print names of the
countries. (Declare enum with names of continents)
*/
enum Continents {
    North_America,
    South_America,
    Africa,
    Asia,
    Europe,
    Antarctica,
    Australia
}

public class Homework3_1 {
    public static void main(String[] args) {

        String North_America[] = {"United States", "Mexico", "Canada", "Guatemala", "Cuba", "..."};
        String South_America[] = {"Brazil", "Colombia", "Argentina", "Peru", "Venezuela", "Chile", "Ecuador", "Bolivia", "Paraguay", "Uruguay", "..."};
        String Africa[] = {"Nigeria", "Ethiopia", "Egypt", "Democratic Republic of the Congo", "South Africa", "Tanzania", "Kenya", "Sudan", "Algeria", "Uganda", "..."};
        String Asia[] = {"China", "India", "Indonesia", "Pakistan", "Bangladesh", "Russia", "Japan", "Philippines", "Vietnam", "Iran", "Turkey", "Thailand", "..."};
        String Europe[] = {"Germany", "France", "United Kingdom", "Italy", "Spain", "Ukraine", "Poland", "Romania", "Netherlands", "Belgium", "Greece", "Finland", "..."};
        String Antarctica[] = {"Antarctica"};
        String Australia[] = {"Australia"};

        Continents continent = Continents.Europe;
        switch (continent) {
            case North_America:
                System.out.println(Arrays.toString(North_America));
                break;
            case South_America:
                System.out.println(Arrays.toString(South_America));
                break;
            case Africa:
                System.out.println(Arrays.toString(Africa));
                break;
            case Asia:
                System.out.println(Arrays.toString(Asia));
                break;
            case Europe:
                System.out.println(Arrays.toString(Europe));
                break;
            case Antarctica:
                System.out.println(Arrays.toString(Antarctica));
                break;
            case Australia:
                System.out.println(Arrays.toString(Australia));
                break;
        }
    }

}



