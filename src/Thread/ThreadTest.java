package Thread;

/*class ThreadTest extends Thread
{
    public void run(){
        int i = 1;
        while (true){
            System.out.println (i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadTest m = new ThreadTest ();
        m.start ();
        int i =1;
        while (true){
            System.out.println (i+ "World");
            i++;
        }
    }
}*/

class ThreadTest implements Runnable
{
    public void run(){
        int i = 1;
        while (true){
            System.out.println (i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        ThreadTest m = new ThreadTest();
        Thread t = new Thread (m);
        t.start ();
        int i =1;
        while (true){
            System.out.println (i+ "World");
            i++;
        }
    }
}





/*class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println ( i + " Hello" );
            i++;
        }
    }
}
   public class ThreadTest {

       public static void main(String[] arg) {
           MyThread m = new MyThread ();
           m.start ();
           int i = 1;
           while (true) {
               System.out.println ( i + "World" );
               i++;
           }
       }
   }*/




