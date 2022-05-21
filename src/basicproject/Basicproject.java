package basicproject;

import java.util.Scanner;

public class Basicproject {
    static final int NUMBER_OF_TIMES_COIN_TOSSED = 1;
    static final int CHECK_LEAP_YEAR = 2;
    static final int POWER_OF_TWO = 3;
    static final int HARMONIC_NUMBER = 4;
    static final int FACTORS_OF_A_NUMBER = 5;
    static final int QUOTIENT_AND_REMAINDER = 6;
    static final int SWAP_TWO_NUMBER = 7;
    static final int CHECK_EVEN_AND_ODD_NUMBERS = 8;
    static final int CHECK_VOWEL_AND_CONSONANT_IN_ALPHABET = 9;
    static final int LARGEST_AMONG_THREE_NUMBERS = 10;

    public static void main(String[] args) {
        System.out.println("number of times coin tossed:" + NUMBER_OF_TIMES_COIN_TOSSED);
        System.out.println("check the given year is a leap year:" + CHECK_LEAP_YEAR);
        System.out.println("calculating the power of two:" + POWER_OF_TWO);
        System.out.println("display the harmonic number:" + HARMONIC_NUMBER);
        System.out.println("caculating factors og the number:" + FACTORS_OF_A_NUMBER);
        System.out.println("quotient and remainder of the number:" + QUOTIENT_AND_REMAINDER);
        System.out.println("swap the two number:" + SWAP_TWO_NUMBER);
        System.out.println("check the given number is odd or even:" + CHECK_EVEN_AND_ODD_NUMBERS);
        System.out.println("check the vowel and consonant in alphabet:" + CHECK_VOWEL_AND_CONSONANT_IN_ALPHABET);
        System.out.println("check the largest number among three numbers:" + LARGEST_AMONG_THREE_NUMBERS);
        int choice;
        project function = new project();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                function.flipCoin();
                break;
            case 2:
                function.leapYear();
                break;


        }


    }
}
