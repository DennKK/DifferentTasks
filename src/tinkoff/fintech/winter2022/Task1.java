package tinkoff.fintech.winter2022;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "YES";
        int a = scan.nextInt(), b = scan.nextInt(), n = scan.nextInt();
        double x = (double) (a + b) / 2;
        double y = (-b + x) / n;
        if (x != (int) x || y != (int) y || x <= 0 || y <= 0 || (a + b) % 2 != 0) {
            result = "NO";
        }
        System.out.println(result);
    }
}