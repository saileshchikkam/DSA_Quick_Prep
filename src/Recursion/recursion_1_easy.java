package Recursion;

import org.w3c.dom.ls.LSOutput;

//recursion with simple example
public class recursion_1_easy {
    public static void printnumber5to1(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        printnumber5to1(n-1);
    }
    public static void printnumber1to5(int n) {
        if (n == 6){
            return;
        }
        System.out.println(n);
        printnumber1to5(n+1);
    }
    public static void sumoffirstnnumbers(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumoffirstnnumbers(i+1,n,sum);

    }
    public static void PrintFactorialofNumber(int n, int factorial){
        if(n==0 || n == 1){
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        PrintFactorialofNumber(n-1, factorial);
    }

    public static void fibanacciSeries(int first, int second, int n, int i){
        if(n == i){
            return;
        }
        System.out.print(first  + " ");
        fibanacciSeries(second, first+second, n, i+1);
    }

    public static void decimalToBinary(int n) {
        if (n == 0) {
            return;
        }

        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }
    public static int stringLength(String str, int i) {
        if (i == str.length()) {
            return 0;
        }
        return 1 + stringLength(str, i + 1);
    }
    public static int calcPower(int x,int n){
        // stack height = n
        if(n == 0){ // base case 1
            return 1;
        }
        if(x == 0){ // base case 2
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static int CalcPower(int x, int n){
        // stack height = log n
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n % 2 == 0){
            return calcPower(x, n/2) *  CalcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2) * CalcPower(x, n/2) * x;
        }
    }

    static void main() {
//        int n =5;
//        printnumber5to1(n);
//        printnumber1to5(1);
//        sumoffirstnnumbers(1,5,0);
//        PrintFactorialofNumber(n,1);
//        fibanacciSeries(0,1,10, 1);
//        decimalToBinary(10);
//        String str = "Sailesh";
//        System.out.println("\nLength = " + stringLength(str, 0));
        int x = 2;
        int n = 5;
        System.out.println(calcPower(x, n));
        System.out.println(CalcPower(x, n));


    }
}
