package main.StringPackage;

public class SplitArray {
    public static void main(String[] args)
    {
        String s= "rohit sharma,virat kohli,surya yadav";
        String[] ar = s.split(",");
        for(int i=0;i<ar.length;i++) {
            System.out.println(ar[i]);
        }

    }
}
