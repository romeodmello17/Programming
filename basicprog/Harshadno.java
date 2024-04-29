package basicprog;

public class Harshadno {
    public static void main(String[] args) {
        int n = 254;
        int num = n;
        int sum= 0;
        while (n!=0) {
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        if(num%sum==0){
            System.out.println("is a harshad number");
        }else{
            System.out.println("not a Harshad number");
        }
        System.out.println(sum);
    }
}
