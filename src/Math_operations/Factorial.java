package Math_operations;

import java.util.Scanner;

public class Factorial {

        public static void main(String[] arg){
            int i,n,fact=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number to check factorial:");
            n = sc.nextInt();

            for (i = 1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("factorial is = " +fact);
        }
    }
