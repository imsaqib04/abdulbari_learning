package StaticPractice;

import java.util.Date;

class Students{

    private String Roll_No;
    private static int count = 1;

    private String assignRollNo() {

        Date d = new Date ();
        String RNo;
        RNo = "Univ-"+(d.getYear ()+1990)+"-"+count;
        count ++;
        return RNo;
    }
    Students(){
        Roll_No = assignRollNo ();
    }
    public String getRoll_No(){
        return assignRollNo ();
    }
}

public class abcde {
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        Student s6=new Student();
        Student s7=new Student();
        Student s8=new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        System.out.println(s4.getRollNo());
        System.out.println(s5.getRollNo());
        System.out.println(s6.getRollNo());
        System.out.println(s7.getRollNo());
        System.out.println(s8.getRollNo());
    }
}
