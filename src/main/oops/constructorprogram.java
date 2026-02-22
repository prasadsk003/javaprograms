package main.oops;

public class constructorprogram {
    int rollNo;
    String name;
    constructorprogram()
    {
        System.out.println("Default constructor");
    }
    constructorprogram(int rN,String N)
    {
        rollNo=rN;
        name=N;
    }
    constructorprogram(constructorprogram C)
    {
        rollNo = C.rollNo;
        name = C.name;
    }
    void  display()
    {
        System.out.println(name+"-"+rollNo);
    }

    public static void main(String[] args)
    {
        constructorprogram s1 = new constructorprogram();
        constructorprogram s2 = new constructorprogram(2,"Prasad");
        constructorprogram s3 = new constructorprogram(s2);
       // s1.display();
        s2.display();
        s3.display();

    }
}
