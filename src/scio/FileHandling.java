package scio;


import java.io.*;

public class FileHandling
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
        File f=new File("C:\\Users\\saqib\\java\\abdulbari_learning\\src");

        System.out.println(f.isDirectory());
        System.out.println (f.getParent ());
        File list[]=f.listFiles();

        for(File x:list)
        {
            System.out.println(x.getParent()+" "+x.getName());
        }

    }
}