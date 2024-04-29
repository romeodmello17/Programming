package basicprog;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 5544;
        int sum=0;
        while (n!=0) {
            int digit=n%10;
            
            sum = digit +sum;
            n=n/10;
                        
        }
        System.out.println(sum);
    }
}
