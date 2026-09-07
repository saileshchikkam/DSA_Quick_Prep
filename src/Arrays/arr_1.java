package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arr_1 {
    static void main() {
        int [] arr = new int [10];
        for(int i=0;i<arr.length;i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 54;
        marks[2] = 93;
        for (int i : marks) {
            System.out.println(i);
        } // in arrays memory address in sequential order

        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr2 = new int [size];
        for(int i=0;i<arr2.length;i++) {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            System.out.print(arr2[i]); // we didn't specify the elements of array
        }
    }
}
