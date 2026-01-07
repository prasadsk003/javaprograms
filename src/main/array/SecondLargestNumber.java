package main.array;

public class SecondLargestNumber {

    public static  void main(String[] args) {
        {
            int a[] = {33,22,22,33,19,18,19,23};
            int largest = a[0];
            int secondLargest = Integer.MIN_VALUE;


             for(int i=1;i<a.length;i++)
             {
                 if(a[i]>largest)
                 {
                     secondLargest = largest;
                     largest = a[i];
                 }
                 else  if( a[i] > secondLargest && a[i] != largest)
                 {
                     secondLargest = a[i];
                 }
             }
            System.out.println(secondLargest);


        }
    }
}
