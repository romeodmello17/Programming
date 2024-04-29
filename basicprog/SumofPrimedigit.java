package basicprog;

public class SumofPrimedigit {
    public static void main(String[] args) {
        int n = 578;
        int sum = 0;
        while (n!=0) {
            int digit = n%10;
            // int count = 0;
            // for(int i = 1 ; i <=digit;i++) {
            //     if (digit % i == 0) {
            //         count++;
            //     }
            // }
            // if (count == 2) {
            //     sum = sum + digit;
            // }
            
            if(digit==2||digit==3||digit==5||digit==7){
                sum = sum +digit;
            }
            n = n/10;
            
        }
        System.out.println(sum);
    }
}
