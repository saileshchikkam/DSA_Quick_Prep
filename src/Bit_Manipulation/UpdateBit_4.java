package Bit_Manipulation;

import java.util.Scanner;

public class UpdateBit_4 {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5; //0101
        int pos = 1;
        // update bit to 1 else update bit to 0

        // set oper
        int bitMask = 1<<pos;
        if(oper == 1){

           int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }
    }
}
