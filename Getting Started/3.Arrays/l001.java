import java.util.*;
public class l001{

    public static Scanner sc = new Scanner(System.in);

    public static void test1(int n){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
    }

    public static void display(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void display2(int[] arr){
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }

    public static void input(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static int[] input2(int n){
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int maximum(int[] arr){
        int maxEle = -(int) 1e9;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
        }
        return maxEle;
    }

    public static int minimum(int[] arr){
        int minEle = (int)1e9;;

        for(int ele:arr){
            minEle = Math.min(ele,minEle);
        }

        return minEle;
    }


    public static void main(String[] args){
        int n = sc.nextInt();
        // test1(n);
        // int[] arr = new int[n];
        // input(arr);
        int[] arr = input2(n);
        // display2(arr);
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        
    }
}