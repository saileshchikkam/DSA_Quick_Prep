package Sorting_Techniques;

import java.util.Arrays;

public class Bubble_Sort {
    static void main() {
        int [] arr = {7,8,3,1,2};

        // time complexity = O(n^2)
        // bubble sort
        for(int i = 0; i < arr.length-1; i++){
            for(int j=0 ; j<arr.length-i-1;j++){// 1 st loop 0 elemnets sorted , next loop 1 element sorted so checking only upto the total elements -1 likewise every loop that's why arr.length - i- 1
                if(arr[j] > arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
