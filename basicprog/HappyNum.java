package basicprog;

import java.util.Scanner;
/*28 = 2^2 + 8^8 = 4 + 64 = 68
 * 68 = 36 + 64 = 100
 * 100  =  1 + 0 + 0 = 1 
 * 28 is a happy number
 * 
 * 
 * 16 = 1 + 36 = 37
 * 37 = 9 + 49 = 58
 * 58 = 25 + 64 = 89
 * 89 = 64 + 81 = 145
 * if 4 then  not a happy number
  */

public class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        while (n!=1 && n!=4) {
            n = digitSquareSum(n);
        }    
        if(n==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not a Happy  number");
        }
     }
     public static int digitSquareSum(int n){
        int sum = 0;
        while (n!=0) {
            int digit = n%10;
            sum = sum + (digit*digit);
            n = n/10;
        }
        return sum;
     }
}
