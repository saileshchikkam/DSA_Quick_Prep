package Recursion;

import java.util.Scanner;

public class recursion_2_medium {
    public static void TowerOfHanoi(int n,String src, String helper, String dest) {
        // Time Complexity = O(2n)
        if(n == 1){
            System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
        TowerOfHanoi(n-1,helper,src,dest);
    }
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        TowerOfHanoi(n,"Src","Helper","Dest");
    }
}
