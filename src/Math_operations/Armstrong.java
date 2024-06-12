package Math_operations;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n,r,sum = 0;
        System.out.println("enter to check the no.");
        n = sc.nextInt();
        int m = n;

        while (n>0){
            r = n % 10;
            n = n/10;
            sum = sum + r*r*r;
        }
//        System.out.println(sum);
        if (sum == m){
            System.out.println("Math_operations.Armstrong");
        }
        else {
            System.out.println("Not Math_operations.Armstrong");
        }
    }
}