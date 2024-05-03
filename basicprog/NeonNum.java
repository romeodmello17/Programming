package basicprog;

import java.util.Scanner;


/*n=9
 * sqr = 81
 * 8+1=9
 */

public class NeonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0 ;
        int square = n*n;
        while (square!=0) {
            int digit = square%10;
            sum = sum + digit;
            square= square/10;
        }
        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}
