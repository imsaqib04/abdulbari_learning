package Pattern;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");

        int n = sc.nextInt();
        int i, j;
        int count = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}

