package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
}
