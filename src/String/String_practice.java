package String;

public class String_practice {

        public static void main (String[] arg)
        {
            java.lang.String str="programmer@gmail.com";
            //String str="programmer@hotmail.com";

            int i=str.indexOf("@");
            java.lang.String uname=str.substring(0,i);
            java.lang.String domain=str.substring(i+1, str.length());
            System.out.println("Username :"+uname);
            System.out.println("Domain :"+domain);

            int j=domain.indexOf(".");
            java.lang.String name=domain.substring(0, j);
            System.out.println(name.equals("gmail"));
        }

    }

