package basicprog;

public class FindPrimeNo {
    public static void main(String[] args) {
        int n =10;
        int count= 0;
       for(int i = 1 ; i<=n;i++){
        if(n%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("prime no.");
    }
    else{
        System.out.println("not prime no.");
    }

    }
}

