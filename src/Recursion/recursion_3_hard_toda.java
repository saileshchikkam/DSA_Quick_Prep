package Recursion;

import java.util.ArrayList;

public class recursion_3_hard_toda {
    public static void PossiblePermutationsOfString(String str, String permutations){
        // Time Complexity = O(n!)
        if(str.length() == 0){
            System.out.println(permutations);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            PossiblePermutationsOfString(newStr, permutations+currChar);
        }
    }
    public static int countPaths(int i, int j, int n, int m){
        if(i == n || j==m) {
            return 0;
        }

        if(i == n-1 && j == m-1) {
            return 1;
        }

        //move downwards
        int downPaths = countPaths(i+1, j, n, m);

        //move right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }

    public static int placeTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertPlacements = placeTiles(n-m,m);
        //horiontally
        int horizPlacements = placeTiles(n-1,m);

        return vertPlacements + horizPlacements;
    }
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }
        //single
        int ways1 = callGuests(n-1);
        // pairs
        int ways2 = (n-1 ) * callGuests(n-2);

        return ways1 + ways2;
    }
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }


    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubsets(subset);
            return;
        }

        findSubsets(n-1, subset);
        subset.add(n);
        findSubsets(n-1, subset);
        subset.remove(subset.size() - 1);
    }

    static void main() {
        PossiblePermutationsOfString("abc","");
        int n = 4, m = 2;
        int totalpaths = countPaths(0,0,n,m);
        System.out.println(totalpaths);
        System.out.println(placeTiles(4,2));
        System.out.println(callGuests(4));
        findSubsets(n, new ArrayList<Integer> ());
    }
}
