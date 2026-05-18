import java.util.*;
public class l001{

    public static Scanner sc = new Scanner(System.in);

    public static void test1(int n){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
    }

    public static void main(String[] args){
        int n = sc.nextInt();
        test1(n);
    }
}