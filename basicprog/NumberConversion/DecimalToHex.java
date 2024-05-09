package basicprog.NumberConversion;

import java.util.Scanner;
/*To convert Decimal to Hexadecimal
 * Decimal divide by base 16
 * if remainder > 9 convert it to CHAR 
 * for upper case  55
 * for lower case  87
 */

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String hex = "";
        while (n != 0 ) {
            int remainder = n%16;
            // if (remainder == 10) {
            //     hex = "A" + hex;
            // }else if (remainder == 11){
            //     hex = "B" + hex;
            // }else if (remainder == 12) {
            //     hex = "C" + hex;
            // }else if (remainder == 13){
            //     hex = "D" + hex;
            // }else if(remainder == 14){
            //     hex = "E" + hex;
            // }else if(remainder == 15){
            //     hex = "F" + hex;
            // }else {
            //     hex = remainder + hex;
            // }
            if(remainder >9){
                hex = (char)(remainder + 55) + hex;
            }else {
                hex = remainder + hex;
            }
            n = n/16;
        }
        System.out.println(hex);
    }
}
