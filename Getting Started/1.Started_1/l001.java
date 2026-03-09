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

    public static void main(String[] args){
        // System.out.println(countDigits(111));
        printDigitsInReverseOrder(123485278);
    }
}