package Sorting_Techniques;

import java.util.Arrays;

public class Insertion_Sort {
    static void main() {
        int[] arr = {7, 8, 3, 1, 2};

        // Insertion Sort
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }
}
