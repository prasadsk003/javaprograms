package main.array;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = new int[20];
        int i = 0;

        // Extract digits into array
        while (num > 0) {
            digits[i] = num % 10;
            num = num / 10;
            i++;
        }

        // Print reversed number
        System.out.print("Reversed number: ");
        for (int j = 0; j < i; j++) {
            System.out.print(digits[j]);
        }
    }

}
