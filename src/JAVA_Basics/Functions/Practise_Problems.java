package JAVA_Basics.Functions;

import java.util.Arrays;
import java.util.Scanner;

public class Practise_Problems {
    //Q1 Enter 3 numbers from the user & make a function to print their average.
    public static int average(int a, int b, int c){
        return (a + b+ c)/3;
    }
    //Q2 Write a function to print the sum of all odd numbers from 1 to n.
    public static void sumofallOddNumbers(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    //Q3 Write a function which takes in 2 numbers and returns the greater of those two.
    public static void greateroftwonumbers(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
    }
    //Q4 Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void circumferenceOfCircle(int radius){
        // 2 pie Radius
        double circumference = 2 * Math.PI * radius;
        System.out.println(circumference);
    }
    //Q5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote
    public static void voteeligibility(int n){
        if(n <=0){
            System.out.println("Invalid age");
            return;
        }
        if(n>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
    //Q6. Write an infinite loop using do while condition.
    public static void infinityloop(int n){
        do {
            System.out.println(n);
        }
        while(n>0);
    }
    //Q7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void countpositive_negative_zeroes(int n){
         int [] arr  = new int[n];
         Scanner input = new Scanner(System.in);
         for(int i=0;i<n;i++){
             arr[i]=input.nextInt();
         }
        System.out.println(Arrays.toString(arr));
         int count_zeroes = 0;
         int count_pos = 0;
         int count_neg = 0;
         for(int i=0;i<n;i++){
             if(arr[i]==0){
                 count_zeroes++;
             } else if (arr[i] < 0) {
                 count_neg++;
             }
             else{
                 count_pos++;
             }
         }
         System.out.println("No of Zeroes: "+count_zeroes);
         System.out.println("No of Negatives: "+count_neg);
         System.out.println("No of Positives: "+count_pos);

    }
    //Q8, Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static void Onenumberraisedtothepowerofother(int x, int n){
        System.out.println(Math.pow(x,n));
    }
    //Q9. Write a function that calculates the Greatest Common Divisor of 2 numbers.
    public static void GCD(int a,int b){
        if (a==0 || b==0){
            return;
        }
        while(b>0){
            // ecludian method
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a+" is the GCD");
    }
    public static void Fibonacci_Series(int n){
        int a =  0;
        int b = 1;
        if(n<=0){
            System.out.println("Invalid number");
        }
        else{
            for (int i = 1; i < n; i++) {
                System.out.print(a+" ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        }

    }
    static void main() {
        Scanner sc  = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("Average of the numbers is "+average(a,b,c));
//        int n  = sc.nextInt();
//        sumofallOddNumbers(n);
//        int a  = sc.nextInt();
//        int b  = sc.nextInt();
//        greateroftwonumbers(a,b);
//        int radius = sc.nextInt();
//        circumferenceOfCircle(radius);
//        int age =  sc.nextInt();
//        voteeligibility(age);
//        int n  = sc.nextInt();
//        infinityloop(n);
//        int n = sc.nextInt();
//        countpositive_negative_zeroes(n);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        Onenumberraisedtothepowerofother(x,n);
//        int n  = sc.nextInt();
//        Fibonacci_Series(n);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD(a,b);
    }
}
