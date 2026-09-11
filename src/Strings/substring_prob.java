package Strings;

import java.util.Scanner;

public class substring_prob {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String emailid = sc.nextLine();
        String name = emailid.substring(0,emailid.indexOf("@"));
        System.out.println(name);

        //another way
        String email = sc.next();
        String userName = "";


        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
