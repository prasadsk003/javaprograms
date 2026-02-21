package main.oops;
abstract class cars{
    int no_of_tyres = 2;
    void displayTyres()
    {
        System.out.println("no of tyres"+no_of_tyres);

    }
    abstract void scooter();

}

class bike extends cars{

    void scooter()
    {
        System.out.println("Scooter starts with key");
    }
}


public class abstractprogram {
    public static void main(String[] args) {
        cars b = new bike();
        b.scooter();

        bike b1 = new bike();
        b1.displayTyres();
    }
}
