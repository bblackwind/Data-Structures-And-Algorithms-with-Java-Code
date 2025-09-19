import java.util.*;

public class l001{

    public static Scanner sc = new Scanner(System.in);

    public static int countNoOfDigit(int n){
        int len = 0;
        while(n>=0){
            n/=10;
            len++;
        }
        return len;
    }

    public static void main(String[] args){
        int n = 95820;  
        System.out.println(countNoOfDigit(n));
    }
}
