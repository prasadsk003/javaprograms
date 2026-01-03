package main.array;

public class comparearray {

    public static void main(String[] args)
    {
        int[] a = {5,3,9,1,2,3};
        int[] b= {1,3,5,7,9,8};
        int count =0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    count++;
                }
            }
        }

        System.out.println("total common number :"+count);

    }
}
