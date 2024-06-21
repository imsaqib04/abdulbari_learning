package InnerClasses;

public class Outer {
    static int x = 19;
    int y = 10;

    static class inner{
        void Display(){
            System.out.println (x);
//            System.out.println (y);//because of this is non static we can't use here
        }
    }
}
