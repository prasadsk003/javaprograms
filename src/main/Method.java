package main;

import javax.sound.midi.SysexMessage;

public class Method {

    void voter(int age) {
        if(age>18)
        {
            System.out.println("Voter is eligile to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args)
    {
        Method ms = new Method();
        ms.voter(17);
        ms.voter(34);

    }
}
