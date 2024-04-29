package basicprog;

// import java.util.Scanner;

public class DigitSeperate {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 5544;
        while (n!=0) {
            int digit=n%10;
            System.out.println(digit);
            n=n/10;            
        }
    }
}
