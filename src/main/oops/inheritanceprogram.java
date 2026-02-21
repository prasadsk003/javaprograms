package main.oops;

class animal{
   void sound()
   {
       System.out.println("sound from aniaml");
   }
}

class dog extends animal
{

    void sound()
    {
        System.out.println("Sound from dog");
    }
}

public class inheritanceprogram {
public static void main(String[] args) {
    dog d = new dog();
    d.sound();
}
}
