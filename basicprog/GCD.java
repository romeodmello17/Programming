package basicprog;

public class GCD {
    public static void main(String[] args) {
        int a = 6    , b = 8;
        int gcd = 1;
        for(int i =1 ; i<=a;i++){
            if (a%i==0&&b%i==0) {
                
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
