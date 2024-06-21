package Math_operations;

import java.util.Scanner;

public class Calculator {

        public static void main (String[] args){

            float a ,b , result = 0;
            int option;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value of first");
            a = sc.nextFloat();
            System.out.println("enter the value of second");
            b = sc.nextFloat();
            System.out.println("choose 1 for add\nchoose 2 for sub\nchoose 3 for mul\nchoose 4 for div\n" );
            System.out.println("choose option to perform");
            option = sc.nextInt();

            switch (option){

                case 1:
                    result = a+b;
                    break;

                case 2:
                    result = a-b;
                    break;

                case 3:
                    result = a*b;
                    break;

                case 4:
                    try {
                        result = a / b;
                    }
                    catch (ArithmeticException e){
                        System.out.println (e);
                    }
                    break;

                default:
                    System.out.println("invalid option");
            }

            System.out.println("result is = " +result);

        }
    }

