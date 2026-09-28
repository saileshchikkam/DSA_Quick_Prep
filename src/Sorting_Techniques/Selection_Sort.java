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
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
