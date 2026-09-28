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
    public static void PrintStringInReverse(String str,int Index){
        // Time Complexity = O(n)
        if(Index == 0){
            System.out.println(str.charAt(Index));
            return;
        }
        System.out.print(str.charAt(Index));
        PrintStringInReverse(str,Index-1);
    }
    public static int first= -1;
    public static int last = -1;

    public static void FindOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println("First Occurence: "+first);
            System.out.println("Last Occurence: "+last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        FindOccurance(str,idx+1,element);
    }
    public static boolean isSorted(int arr[], int idx){
        // checking the Strictly increasing array
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            //array is sorted till now
            return isSorted(arr,idx+1);
        }
        else{
            return false;
        }
    }
    static void main() {
        Scanner sc =  new Scanner(System.in);
        int n = 3; // pass any no:of tower values
        TowerOfHanoi(n,"Src","Helper","Dest");
        String str = "Sailesh";
        PrintStringInReverse(str,str.length()-1);
        String str1 = "aaabaanjnvjnsc";
        FindOccurance(str1,0,'a');
        System.out.println(isSorted(new int[]{1,3,5,6},0));
    }
}
