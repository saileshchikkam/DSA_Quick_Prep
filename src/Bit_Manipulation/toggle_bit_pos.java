package Bit_Manipulation;

public class toggle_bit_pos {
    static void main() {
        int n = 5; // Example: 5 is 0101 in binary
        int pos = 1;

        int bitMask = 1 << pos;
        int newNumber = n ^ bitMask; // Using XOR operator to toggle the bit

        System.out.println("Original number: " + n);
        System.out.println("New number after toggling bit at position " + pos + ": " + newNumber);
    }
}
