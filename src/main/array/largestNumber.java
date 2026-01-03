package main.array;

public class largestNumber {
    public static void main(String[] args){
        int[] a= {1,4,5,10,9,2};
        int max = a[0];
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];

            }

        }
        System.out.println(max);
    }
}
