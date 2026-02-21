package main.oops;

class student
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name= name;
    }

    public void setAge(int age)
    {
        if(age>0)
        {
            this.age=age;
        }
        else
        {
            System.out.println(age);
        }
    }
}
public class encapsulationprogram {
    public static void main(String[] args)
    {
        student s1= new student();
        s1.setName("Prasad");
        s1.setAge(26);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
