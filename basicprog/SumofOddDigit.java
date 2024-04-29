package basicprog;

public class SumofOddDigit {
    public static void main(String[] args) {
        
        int n = 2514795;
        int sum = 0;
        while (n!=0) {
            int digit=n%10;
            if(digit%2!=0){

                sum = digit +sum;
            }
            n=n/10;
            
        }
        System.out.println(sum);
    }
}
