package basicprog;

public class OddDigit {
    public static void main(String[] args) {
        int n = 7789;
        while (n!=0) {
            int digit=n%10;
            if(digit%2!=0){

                System.out.println(digit);
            }
            n=n/10;            
        // 
        }
    }
}
