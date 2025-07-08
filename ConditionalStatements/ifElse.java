package ConditionalStatements;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //if-else
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

        //if-else if-else
        System.out.print("A=");
        int a = sc.nextInt();
        System.out.print("B=");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");
        }else if(a>b){
            System.out.println("A is greater");
        }else{
            System.out.println("B is greater");
        }
    sc.close();
    }
}
