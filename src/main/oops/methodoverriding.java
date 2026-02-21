package main.oops;
//method overrding is run time ploymorphism which include mechanism of
//same method name with same parameters with different class name

class car
{
    void carname()
    {
        System.out.println("BMW");
    }
}
class engine extends car
{

    void carname()
    {
        System.out.println("SKODA");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        engine e = new engine();
        e.carname();
        car  c = new engine();
        c.carname();
    }
}