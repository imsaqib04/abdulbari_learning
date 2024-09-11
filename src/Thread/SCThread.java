package Thread;

class ATM {

   synchronized public  void CheckBalance(String name) {
        System.out.print ( name + " checking " );
        try {
            Thread.sleep ( 1000 );
        } catch (Exception e) {

        }
        System.out.println ( "balance" );
    }

  synchronized public  void Withdraw(String name, int amount) {
        System.out.print ( name + " withdrawing " );
        try {
            Thread.sleep ( 1000 );
        } catch (Exception e) {

        }
        System.out.println ( "amount" );
    }
}

class customer extends Thread {
    String name;
    int amount;
    ATM atm;
    customer(ATM a,String n ,int amt){
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM(){
        atm.CheckBalance ( name );
        atm.Withdraw ( name ,amount );
    }
    public void run(){
        useATM ();
    }
}

public class SCThread {
public static void main(String[] args) {
    ATM atm = new ATM ();
    customer c1 = new customer ( atm ,"saqib",100 );
    customer c2 = new customer ( atm ,"abcd",10 );
    c1.start ();
    c2.start ();
}
}
