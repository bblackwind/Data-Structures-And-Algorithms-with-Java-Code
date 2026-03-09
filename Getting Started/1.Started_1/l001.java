public class l001{

    public static int countDigits(int n){
        int count = 0; 
        while(n!=0){
            n /= 10;
            count++;
        }
        return count;
    }

    public static void printDigitsInReverseOrder(int n){

        while(n !=0 ){
            int dig = n%10;
            System.out.println(dig);
            n /= 10;
        }
    }

    public static int powerEqualDigit(int n){
        int pow = 1;
        while(n != 0){
            pow *= 10;
            n /= 10;
        }
        return pow;
    }

    public static void digitOfNumber(int n){
        int pow = powerEqualDigit(n);
        pow /= 10;

        while(pow > 0){
            int digit = n / pow;
            System.out.println(digit);
            n %= pow;
            pow /= 10;
        }
    }



    public static void main(String[] args){
        // System.out.println(countDigits(111));
        // printDigitsInReverseOrder(123485278);
        // System.out.println(powerEqualDigit(123485278));
        digitOfNumber(123485278);
        
    }
}