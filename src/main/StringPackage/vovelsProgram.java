package main.StringPackage;

public class vovelsProgram {
    public static void main(String[] args)
    {
        String s = "Manual Testing and Automation Testing";
        String vovels ="";

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o')
            {
                vovels=vovels+ch;

            }

        }
        System.out.println(vovels);
    }
}
