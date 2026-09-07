package Arrays;

import java.util.Scanner;

public class arr_2 {
    static void main() {
        //Qs. Take an array as input from the user. Search for a
        //given number x and print the index at which it occurs.

        // Linear Search
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = 5;
        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                System.out.println(i);
            }
        }
    }
}
