package scio;

import java.io.*;

public class ScIo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream ( "C:/Users/saqib/java/abdulbari_learning/src/scio/Source1.txt" );
        FileOutputStream fos = new FileOutputStream ("C:/Users/saqib/java/abdulbari_learning/src/scio/Source2.txt" );

        int b;
        while(( b = fis.read ())!=-1)
        {
            if (b>=65 && b<=99)
                fos.write ( b+32 );
            else {
                fos.write ( b );
            }
            fis.close ();
            fos.close ();
        }
    }

}
