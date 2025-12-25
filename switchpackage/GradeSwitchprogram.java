package switchpackage;

public class GradeSwitchprogram {
    public static void main(String[] args)
    {
        char a='B';

        switch(a)
        {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("Fair effort");
                break;
            case 'D':
                System.out.println("Needs Improvment");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade!");

        }
    }
}
