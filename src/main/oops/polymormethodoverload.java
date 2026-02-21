package main.oops;
// method overloading is compile time polymorphism in which
//1 method overloading include same method name but with different parameters
//within same class
class methodoverload {

    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
public class polymormethodoverload {
    public static void main(String[] args) {
        methodoverload d = new methodoverload();
        System.out.println(d.add(2,3));
        System.out.println(d.add(2,3,4));

    }
}

