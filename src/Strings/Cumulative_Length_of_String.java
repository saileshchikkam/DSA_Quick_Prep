package Strings;

import java.util.Scanner;

public class Cumulative_Length_of_String {
    static void main() {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] array = new String[n];
        int combinedlength = 0;
        for(int i=0; i<n; i++){
            array[i] = sc.next();
            combinedlength += array[i].length();
        }
        System.out.println(combinedlength);
    }
}
