package Math_operations;

import java.util.Scanner;

public class Area {

        public static void main(String [] arg) {
       /* float  base ,height ,area;
        System.out.println("enter the value of height and base:");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (height*base)/2;
        System.out.println("triangle area is " +area);*/
            Scanner sc = new Scanner (System.in);
            int a,b,c;
            double area ,s;
            System.out.println("enter the 3 sides of triangle: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            s = (a+b+c)/2f;

            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area Of Triangle Is = " +area);

        }
    }