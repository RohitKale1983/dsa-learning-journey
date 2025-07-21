package FunctionsAndMethods;

import java.util.Scanner;

public class basicFunction {
    public static void printMyname(String name){
        System.out.println("My name is "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyname(name);
        sc.close();
    }
}
