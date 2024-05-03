package Rough;

import java.util.Scanner;

public class Rough {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number to divide");
        int num=sc.nextInt();
        System.out.println("Enter the divisor");
        int div=sc.nextInt();
        if (div==0){
            System.out.println("Division by zero is not allowed.");
        }else{
            int mod = num%div;
            System.out.println(mod);
        }
    }
}
