package switchpackage;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args)
    {
        int a,b;
        a=10;
        b=20;

        int c;
        c=2;
                switch(c)
                {
                    case 0:
                        System.out.println(a+b);
                        break;
                    case 1:
                        System.out.println(a-b);
                        break;
                    case 2:
                        if(a>b) {
                            System.out.println(a * b);

                        }
                        else
                            System.out.println(a+b);
                        break;
                    default:
                        System.out.println("Please select any choice");
                }
    }
}
