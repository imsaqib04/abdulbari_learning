package Pattern;

import java.util.Scanner;

public class Pattern4{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the value:");
        n = sc.nextInt();


        for (i = 1;i<=n;i++){
            for (j=1;j<=n-i+1;j++){

                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
