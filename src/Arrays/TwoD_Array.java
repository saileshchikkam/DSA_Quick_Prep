package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
