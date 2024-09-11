package Thread.Synchronisation;

class MyData {

    synchronized public void Display(String str)
    {
        for (int i = 0; i < str.length (); i++)
        {
            System.out.print ( str.charAt ( i ) );

            try
            {
                Thread.sleep ( 1000 );
            }
            catch (Exception e)
            {
                System.out.println ( e );
            }
        }
    }
}


class MyThread extends Thread
{
    MyData d;
    public MyThread(MyData d)
    {
        this.d = d;
    }
    public void run()
    {
        d.Display ( "HELLO MR. " );
    }
}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d = d;
    }
    public void run()
    {
        d.Display ( "SAQIB ANSARI" );
    }
}

public class synDemo
{
    public static void main(String[] args)
    {
        MyData data = new MyData ();
        MyThread t = new MyThread ( data );
        MyThread2 t2 = new MyThread2 ( data );
        t.start ();
        t2.start ();
    }
}