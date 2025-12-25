import java.util.Scanner;

public class MiniVendingMachine {
    public static void main(String[] args)
    {
        int a;

    System.out.println("1:Chips");
        System.out.println("2:Chocolate");
        System.out.println("3:Juice");
        System.out.println("4:Soda");
        System.out.println("5:Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you choice");
         a = sc.nextInt();


        switch(a)
        {
            case 1:
                System.out.println("Chips"+"$20");
                break;
            case 2:
                System.out.println("Chocolate"+"$30");
                break;
            case 3:
                System.out.println("Juice"+"$25");
                break;
            case 4:
                System.out.println("Soda"+"$40");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");


        }
    }
}
