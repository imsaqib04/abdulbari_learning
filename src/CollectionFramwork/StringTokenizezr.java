package CollectionFramwork;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizezr {

    public static void main(String[] args) throws Exception {


/*        FileInputStream fis = new FileInputStream ( "" );
//
//        byte b[] = new byte[fis.available ()];
//        fis.read ( b );
//
      String data = new String ( b );*/

        String data = "name=Saqib address=HYD country=india dept=cse";


        StringTokenizer stk = new StringTokenizer ( data, "= " );

        String s ;
        ArrayList<Integer> al = new ArrayList<> ();


        while (stk.hasMoreTokens ()) {
            s = stk.nextToken ();

        }
        System.out.println ( al);
    }
}
