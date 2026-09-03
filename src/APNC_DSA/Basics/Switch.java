package APNC_DSA.Basics;

import java.util.Scanner;

public class Switch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        //switch replaces the if, else-if, else
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case  3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
