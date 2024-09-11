package Other;
//import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo
{
    //@Other.MyAnno(name="Ajay")
    int data;

    //@Other.MyAnno(name="Ajay")
    public static void main(String[] args)
    {
        //@Other.MyAnno(name="Ajay")
        int x;
    }

}