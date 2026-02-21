package main.methods;

import javax.sound.midi.SysexMessage;

public class MethodOverload {
    public void add(int x,int y)
    {
        int c= x+y;
        System.out.println(c);
    }
    public void add(int d,int y,int z)
    {
        int c= d+y+z;
        System.out.println(c);
    }

    public static void main(String[] args)
    {
        MethodOverload m1= new MethodOverload();
        m1.add(2,3);
        m1.add(2,3,4);
    }


}
