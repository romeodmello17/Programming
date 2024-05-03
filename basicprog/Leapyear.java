package basicprog;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        isLeapyear(year);
        
    }
    public static void isLeapyear(int year){
        if (year % 4 ==  0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println("The given year "+ year + " is a leap year");
        }else{
            System.out.println("The given year "+ year + " is not a leap year");
        }
    }
    
}
