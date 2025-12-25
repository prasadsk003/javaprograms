package main.whileloopprogram;

import java.util.Scanner;

public class sentinelloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers, -1 to stop:");
        int n = sc.nextInt();

        while (n != -1) {
            sum += n;
            n = sc.nextInt(); // update with new input
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }

}
