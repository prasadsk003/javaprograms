package main.forloopprogram;

public class divisibleProgram {
    public static void main(String[] args){
        int count,i;
    count = 0;
        for (i=0;i<=1000;i++){
            if(i%5==0 && i%25 ==0 ){
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total number :"+ count);

    }
}
