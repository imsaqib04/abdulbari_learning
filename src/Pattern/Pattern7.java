package Pattern;

import java.util.Scanner;

public class Pattern7 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int i,j,n;
            System.out.println("enter the value:");
            n = sc.nextInt();
            for (i = 1; i <= n; i++){
                for (j = 1; j<= n; j++){
                if(i<=j){


                   System.out.print("* ");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

