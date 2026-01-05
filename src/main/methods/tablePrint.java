package main.methods;

public class tablePrint {

    void printtable(int x)
    {
        for(int i =1;i<=10;i++)
        {
            System.out.println(x*i);
        }
    }

    public static void main(String[] args)
    {
        tablePrint p = new tablePrint();
        p.printtable(8);

    }
}
