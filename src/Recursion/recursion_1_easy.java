package Recursion;

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
    static void main() {
        int n =5;
        printnumber5to1(n);
        printnumber1to5(1);
        sumoffirstnnumbers(1,5,0);
    }
}
