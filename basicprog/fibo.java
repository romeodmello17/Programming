package basicprog;
class fibo{
    public static void main(String[] args) {
        int n = 8 ;
        int a=0,b=1,c=0;
        for(int i = 1; i<=n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}