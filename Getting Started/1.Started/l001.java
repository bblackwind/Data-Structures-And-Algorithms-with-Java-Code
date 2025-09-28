import java.util.*;

public class l001{

    public static Scanner sc = new Scanner(System.in);

// function to count number of digits
    public static int countNoOfDigit(int n){
        int len = 0;
        while(n>=0){
            n/=10;
            len++;
        }
        return len;
    }

//function to print number in Reverse order
    public static void printDigitsInReverseOrder(int n){
        while(n>0){
            int digit = n%10;
            n/=10;
            System.out.println(digit);
        }
    }

//power function
    public static int powerEqualDigits(int n){
        int pow = 1;
        while(n!=0){
            pow *= 10;
            n /= 10;
        }
        return pow;
    }

//function to print numbers in forward order

    public static void printDigitsOfNumber(int n){

        int pow = powerEqualDigits(n);
        pow /= 10;
        while(pow != 0){
            int quo = n/pow;
            n %= pow;
            pow /= 10;
            System.out.println(quo);
        }

    }


    public static void main(String[] args){
        int n = 9582000;  
        // System.out.println(countNoOfDigit(n));
        // printDigitsInReverseOrder(n);
        printDigitsOfNumber(n);
    }
}
