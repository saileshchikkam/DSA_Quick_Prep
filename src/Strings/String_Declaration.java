package Strings;

import java.util.Scanner;

public class String_Declaration {
    static void main() {
        String name = "sailesh";
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the name of a string");
        name = sc.nextLine();
        System.out.println(name);
        // String Concatenation
        System.out.println(name.length());

        //charAt
        for(int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        String st1 = "Sailesh";
        String st2 = "Sailesh";
        //comparTo
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        // == in many cases it fails
        if(st1.compareTo(st2) == 1) {
            System.out.println("The strings are the same");
        }
        else{
            System.out.println("The strings are not the same");
        }

        //fails here
        if(new String("Tony") == new String("Tony")){
            System.out.println("The strings are the same");
        }
        else{
            System.out.println("The strings are not the same");
        }
        //substring
        String Sentence = "My name is Sailesh";
        String name1 = Sentence.substring(11,Sentence.length());
        System.out.println(name1);

        //Strings are Imuutable then what  to do ---> String Builder


    }
}
