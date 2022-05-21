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
}