package Strings;

import java.util.Scanner;

public class replace_e_with_i_probinString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        String result = "";
        for (int i=0 ; i<n.length() ; i++) {
            if(n.charAt(i)=='e') {
                result  += 'i';
            }
            else{
                result  += n.charAt(i);
            }
        }
        System.out.println(result);
    }
}
