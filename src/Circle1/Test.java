package Circle1;

public class Test
{

    public static void main(String[] args)
    {
        Cylinder c=new Cylinder();

        c.radius=7;
        c.height=10;

        System.out.println("Volume "+c.volume());
        System.out.println("Area "+c.area());

    }

}
