package StudentChallange;

import java.io.*;
import java.util.*;

class Account implements Serializable{
    String accountnumber;
    String name;
    Double balance;

    Account(){

    }

    Account(String a,String n,double b){
        accountnumber = a;
        name = n;
        balance = b;
    }
    public String toString(){
        return "Account No :" +accountnumber +"\nname :"+name +"\nBalance :"+balance+"\n";
    }
}



public class S_C_Collection {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner ( System.in );

        Account acc = null;
        HashMap<String, Account> hm = new HashMap<> ();

        try {
            FileInputStream fis = new FileInputStream ( "Accounts.txt" );
            ObjectInputStream ois = new ObjectInputStream ( fis );


            int count = ois.readInt ();
            for (int i = 0; i < count; i++) {
                acc = (Account) ois.readObject ();
                System.out.println ( acc );
                hm.put ( acc.accountnumber, acc );

            }

            fis.close ();
            ois.close ();

        }
        catch (Exception e) {
        }


        FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        System.out.println("Menu");

        int choice;
        String accountnumber;
        String name;
        double balance;

        do
        {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1: System.out.println("Enter Details Accno, Name ,balance ");
                 accountnumber=sc.nextLine();
                    name=sc.nextLine();
                    balance=sc.nextDouble();
                    acc=new Account(accountnumber,name,balance);
                    hm.put(accountnumber, acc);
                    System.out.println("Account Created for "+name);

                    break;
                case 2: System.out.println("Enter Accno");

                    accountnumber=sc.nextLine();
                    hm.remove(accountnumber);
                    break;
                case 3: System.out.println("Enter Accno");
                    accountnumber=sc.nextLine();
                    acc=hm.get(accountnumber);
                    System.out.println(acc);
                    break;
                case 4:
                    for(Account a:hm.values())
                        System.out.println(a);
                    break;

                case 5:
                case 6: oos.writeInt(hm.size());

                    for(Account a:hm.values())
                        oos.writeObject(a);

            }

        }

        while(choice!=6);
        oos.flush();
        oos.close();

        fos.close();
    }

}

