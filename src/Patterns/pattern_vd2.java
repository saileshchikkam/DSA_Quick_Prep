package Patterns;

import java.util.Scanner;

public class pattern_vd2 {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        //1.
        //*
        //**
        //***
        //****
        //*****
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++) {
//            for (int j=0;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //2.
        //*****
        //*****
        //*****
        //*****
        //*****
//        for(int i = 0;i<n;i++) {
//            for (int j = 0;j<n;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //3.
        //* * * * *
        //*       *
        //*       *
        //* * * * *
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        for(int i = 1;i<=rows;i++) {
//            for (int j = 1;j<=cols;j++) {
//                if(i==1 || j==1 || i==rows || j==cols) {
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //4.
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
//        int rows = sc.nextInt();
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //5.
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        // 2 ways are there
//        int n = sc.nextInt();
        // 1st way
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //2nd way
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //6.
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *
//        int n =  sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //7.
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
//        int n =  sc.nextInt();
//        for(int i =1;i<=n;i++){
//            for (int j =1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //8.
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        //1st way
//        int n =  sc.nextInt();
//        for(int i=n ; i>=1 ; i--) {
//            for (int j=1 ; j<=i ; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        //2nd way
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //9.
        // floyd's triangle
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
//        int n =  sc.nextInt();
//        int number = 1;
//        for(int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

        //10.
        // 0-1 Triangle
        //1
        //0 1
        //1 0 1
        //0 1 0 1
        //1 0 1 0 1
        int n =  sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                 if((i+j) % 2 == 0) { //even
                     System.out.print("1 ");
                 }
                 else{ //odd
                     System.out.print("0 ");
                 }
            }
            System.out.println();
        }

    }
}
