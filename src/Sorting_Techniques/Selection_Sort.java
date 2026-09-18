package Sorting_Techniques;

import java.util.Arrays;

public class Selection_Sort {
    static void main() {
        int [] arr = {7,8,3,1,2};

        // Time Complexity O(n^2)
        // selection sort
        for(int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
