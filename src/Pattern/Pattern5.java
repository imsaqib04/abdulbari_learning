package Pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int count = 0;
        System.out.println("Enter the value:");
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println(" ");
        }
    }
}