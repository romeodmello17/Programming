package basicprog;

import java.util.Scanner;

public class Spyno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n!=0) {
            int digit = n%10;
            sum = sum + digit;
            product = product*digit;
            n = n/10;
        }
        if (sum == product){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
    }    
}
