package Recursion;

import java.util.HashSet;
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
        // Time Complexity = O(1)
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
    public static void moveAllxtoEND(String str, int idx, int count, String newString){
        // Time Complexity = O(n)
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;//0,1,2,3,.......
            moveAllxtoEND(str,idx+1,count,newString);
        }
        else{
            newString += currChar;
            moveAllxtoEND(str,idx+1,count,newString);
        }
    }
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx,String newString){
        // Time Complexity = O(n)
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']){
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString += currchar;
            map[currchar-'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void subsequences(String str, int idx, String newString){
        // Time Complexity = O(2^n)
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString + currChar);
        // not to be
        subsequences(str, idx+1, newString);
    }
    public static void subsequences_unique(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString + currChar);
        // not to be
        subsequences(str, idx+1, newString);
    }
    public static String [] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printkeypadComb(String str, int idx, String combination){
        // Time Complexity: O(4^n)
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i = 0; i < mapping.length(); i++){
            printkeypadComb(str, idx+1, combination + mapping.charAt(i));
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
        moveAllxtoEND("axbxcvghx",0,0,"");
        removeDuplicates("abbccda",0,"");
        String str3 = "abc";
        subsequences(str3,0,"");
        String str4 = "aaa";
        HashSet<String> set  = new HashSet<>();
        subsequences_unique(str4, 0, "",set);
        String str5 = "23";
        printkeypadComb(str5,0,"");
    }
}
