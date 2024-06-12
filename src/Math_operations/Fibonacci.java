package Math_operations;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("enter the terms");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = b + a;
            a = b;
            b = c;
        }
    }
}