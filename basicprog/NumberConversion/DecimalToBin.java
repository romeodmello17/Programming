package basicprog.NumberConversion;

import java.util.Scanner;

/*T o convert decimal to binary
 * Divide decimal number to base value of binary i.e. base 2
 */

public class DecimalToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        while(n!=0){
            int remainder = n % 2 ;
            binary = remainder + binary;
            n = n / 2;
        }
        System.out.println(binary);
    } 
}
