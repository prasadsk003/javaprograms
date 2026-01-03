package main.array;

public class aveSumofarray {
    public static void main(String[] args) {

        int a[] = {1,2,4,7,3,1,6,5,6,24,234,6,9};
        int sum;
        double avg;
        sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];

        }
        System.out.println("Summ o arrays:"+sum);
       avg = sum/a.length;
        System.out.println("Average of array:"+avg);


    }

}
