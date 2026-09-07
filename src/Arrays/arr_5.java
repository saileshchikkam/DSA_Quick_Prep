package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []  arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<n-1;i++) {
            if(arr[i]>arr[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("ascending");
        }
        else {
            System.out.println("descending");
        }
    }
}
