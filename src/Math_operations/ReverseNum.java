package Math_operations;

import java.util.Scanner;

public class ReverseNum {
        public static void main (String[] arg){
            Scanner sc = new Scanner(System.in);
            int n,r,rev=0;
            System.out.println("enter the number to revrese");
            n = sc.nextInt();
            while (n>0) {
                r = n % 10;
                rev = rev*10+r;
                n = n / 10;
            }
            System.out.print("reverse number is = " +rev);
        }
    }
