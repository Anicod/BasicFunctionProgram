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

    void factorOfaNumber() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an number");
        number = sc.nextInt();
        System.out.println("The total factor of:" + number);
        for (int factor = 2; factor < number; factor++) {
            while (number % factor == 0) {
                System.out.println(factor);
                number = number / factor;

            }
        }
    }
    void quotientAndremainder() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        number = sc.nextInt();
        int quotient = number / 10;
        int remainder = number % 10;
        System.out.println("quotient is :" +quotient);
        System.out.println("remainder is :" +remainder);

    }
    void swapOfnumber(){
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("number num1=" +num1);
        System.out.println("number num2=" +num2);
    }
    void evenOdd() {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        number = sc.nextInt();
        if(number%2==0)
            System.out.println("the given number is even " +number);
        else
            System.out.println(" the given number is odd " +number);
    }
    void consonantAndvowel() {
        char alpha ;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any charcter");
        alpha = sc.next().charAt(0);
        switch(alpha)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'u' :
            case 'o' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'U' :
                count++;
        }
        if(count == 1)
            System.out.println("entered character "+alpha+" is vowel");
        else
            System.out.println("entered character is "+alpha+" is consonent" );

    }
    void largestNumber() {
        int numberA, numberB, numberC;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a three numbers");
        numberA = sc.nextInt();
        numberB = sc.nextInt();
        numberC = sc.nextInt();
        if(numberA>numberB && numberA>numberC)
            System.out.println(+numberA+ " is greatest number");
        else if(numberB>numberC && numberB>numberA)
            System.out.println( +numberB+ " is greater");
        else if(numberC>numberA && numberC>numberB)
            System.out.println(+numberC+ " is greater");
    }
}