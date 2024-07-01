package String;

import java.util.Locale;

public class StringBuffBuild {
    public static void main(String[] args) {

        String S1 = new String ("Saqib ");   // immutable (in heap)
        StringBuilder S2 = new StringBuilder ("Saqib ");  // mutable
        StringBuffer S3 = new StringBuffer("Saqib ");   //mutable

        S1.concat ( "Ansari" );
        S2.append ( "Ansari" );
        S3.append ( "Ansari" );

        System.out.println (S1);
        System.out.println (S2);
        System.out.println (S3);

    }
}
