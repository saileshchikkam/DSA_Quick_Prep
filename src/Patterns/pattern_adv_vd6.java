package Patterns;

import java.util.Scanner;

public class pattern_adv_vd6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // 11.
//        int n = sc.nextInt();
//        //*             *
//        //* *         * *
//        //* * *     * * *
//        //* * * * * * * *
//        //* * * * * * * *
//        //* * *     * * *
//        //* *         * *
//        //*             *
//        for(int i=1; i<=n; i++){ //first stars
//            for(int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            int spaces = 2*(n-i); // spaces
//            for(int k=1; k<=spaces; k++){
//                System.out.print("  ");
//            }
//            for(int k=1; k<=i; k++){ // second stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++) {
//                System.out.print("* ");
//            }
//            int spaces = 2*(n-i);
//            for(int k=1; k<=spaces; k++){
//                System.out.print("  ");
//            }
//            for(int k=1; k<=i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // 12.
        // solid rhombus
        //        * * * * *
        //      * * * * *
        //    * * * * *
        //  * * * * *
        //* * * * *
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++) {
//            for(int j = 1; j<=(n-i); j++) {
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //13.
        //Number Pyramid
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5
//        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //14.
        //Palindromic Pattern
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            //spaces
//            for(int j = 1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j = i; j>=1; j--){
//                System.out.print(j+" ");
//            }
//            for (int j = 2; j<=i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //15.
        // Diamond Pattern
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
