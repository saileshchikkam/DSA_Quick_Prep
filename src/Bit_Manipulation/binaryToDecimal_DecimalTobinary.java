package Bit_Manipulation;

import java.util.Scanner;

public class binaryToDecimal_DecimalTobinary {
    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("Binary: 0");
            return;
        }
        StringBuilder binary = new StringBuilder();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 2;
            binary.insert(0, rem);
            temp /= 2;
        }
        System.out.println("Decimal " + n + " in Binary is: " + binary);
    }

    public static void binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int power = 1;
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            int digit = binaryStr.charAt(i) - '0';
            decimal += digit * power;
            power *= 2;
        }
        System.out.println("Binary " + binaryStr + " in Decimal is: " + decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number to convert to binary: ");
        int dec = sc.nextInt();
        decimalToBinary(dec);

        System.out.print("Enter a binary string to convert to decimal: ");
        String bin = sc.next();
        binaryToDecimal(bin);
    }
}
