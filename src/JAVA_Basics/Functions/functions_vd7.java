package JAVA_Basics.Functions;

import java.util.Scanner;

public class functions_vd7 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void sumofnumbers(int n,int m){
        int sum = n +m;
        System.out.println(sum);
        return;
    }
    public static int productofnumbers(int n,int m){
        return n * m;
    }
    public static int factorial(int n){
        int factorial = 1;
        if(n<0){
            System.out.println("Invalid number");
        }
        else{
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }
    static void main() {
        Scanner sc =  new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sumofnumbers(n,m);
//        System.out.println(productofnumbers(n,m));
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
