package Array;

public class Array1 {
        public static void main(String[] arg) {

            // declare in three types:
//        int a[] = new int[5];
            int b[] = {2, 4, 6, 8, 9};
//        int c[];
//        c = new int[5];
            int i;
//        for (int i = 0; i <= b.length - 1; i++) {
//            System.out.println(b[i]);
//        }

            // second methode for each loop:
            // but this is showing elements only in forward directions:

//        for (int x : b) {
//            System.out.println(x);
//        }
            System.out.println(b.length);

            for (i = b.length - 1; i >= 0; i--) {
                System.out.println(b[i]);
            }
        }

    }