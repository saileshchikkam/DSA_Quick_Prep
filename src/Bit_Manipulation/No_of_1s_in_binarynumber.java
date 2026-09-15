package Bit_Manipulation;

import java.util.Scanner;

public class No_of_1s_in_binarynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;
        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;
        }

        System.out.println("Number of 1's in binary representation of " + n + " is: " + count);
    }
}
