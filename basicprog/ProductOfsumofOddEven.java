package basicprog;

public class ProductOfsumofOddEven {
    public static void main(String[] args) {
        int n = 2514795;
        int SumofOddDigit = 0;
        int SumofEvenDigit = 0;
        int product = 1 ;
        while(n !=0){
            int digit=n%10;
            if(digit%2!=0){

                SumofOddDigit = digit +SumofOddDigit;
            }else{
                SumofEvenDigit = digit + SumofEvenDigit;
            }
            product = SumofEvenDigit * SumofOddDigit;
            n=n/10;
            
            
        }
        System.out.println(product);
    }
}
