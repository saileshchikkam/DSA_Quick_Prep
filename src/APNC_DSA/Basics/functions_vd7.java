package APNC_DSA.Basics;

import java.util.Scanner;

public class functions_vd7 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    static void main() {
        Scanner sc =  new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
}
