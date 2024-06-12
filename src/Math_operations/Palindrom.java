package Math_operations;

import java.util.Scanner;

public class Palindrom {
        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            int r,n,rev=0;
            System.out.println("enter the number to check");
            n = sc.nextInt();
            int m = n;
            while (n>0){
                r = n%10;
                rev = rev*10+r;
                n = n/10;
            }
            if (m==rev){
                System.out.println("Math_operations.Palindrom");
            }
            else {
                System.out.println("Not Math_operations.Palindrom");
            }
        }
    }
