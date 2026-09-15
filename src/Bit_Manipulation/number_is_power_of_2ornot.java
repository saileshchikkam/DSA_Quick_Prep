package Bit_Manipulation;

import java.util.Scanner;

public class number_is_power_of_2ornot {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0 && (n & (n-1)) == 0){
            System.out.println("Number is power of 2");
        }
        else{
            System.out.println("Number is not power of 2");
        }
    }
}
