package basicproject;

import java.util.Random;
import java.util.Scanner;

public class project {
    void flipCoin() {
        int flipCoin;
        int flip = 0;
        int countHead = 0;
        int countTail = 0;
        Scanner sc = new Scanner(System.in);
        flipCoin = sc.nextInt();
        while (flip < flipCoin) {
            Random check = new Random();
            int isHead = check.nextInt(2);
            if (isHead == 1)
                countHead++;
            else
                countTail++;
            flip++;
        }
        System.out.println(countHead);
        double total = countHead + countTail;
        double pHead = countHead / total;
        double pTail = countTail / total;
        System.out.println("Head percentage" + pHead * 100);
        System.out.println("Tail percentage" + pTail * 100);
    }

    void leapYear() {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an year:");
        year = sc.nextInt();
        if (year % 4 != 0)
            System.out.println("not a leap year:" + year);
        else if (year % 100 != 0)
            System.out.println("leap year:" + year);
        else if (year % 400 != 0)
            System.out.println("not leap year:" + year);
        else
            System.out.println("leap year:" + year);


    }

    void powerOftwo() {
        int base = 2;
        int power = 1;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the power of 2");
        number = sc.nextInt();
        for (int num = 0; num < number; num++) {
            power = power * base;
        }
        System.out.println("2 to the power " + number + " is " + power);
    }
}