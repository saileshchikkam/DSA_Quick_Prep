package Recursion;

public class factorial_recursion {
    public static void PrintFactorialofNumber(int n, int factorial){
        if(n==0 || n == 1){
            System.out.println(factorial);
            return;
        }
        factorial *= n;
        PrintFactorialofNumber(n-1, factorial);
    }

    static void main() {
        PrintFactorialofNumber(5,1);
    }
}
