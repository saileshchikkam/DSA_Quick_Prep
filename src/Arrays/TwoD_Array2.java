package Arrays;

import java.util.Scanner;

public class TwoD_Array2 {
    public static void main(String[] args) {
        //Qs. Take a matrix as input from the user. Search for a
        //given number x and print the indices at which it occurs.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j]==5){
                    System.out.print(i+" , "+j);
                }
            }
        }
    }
}
