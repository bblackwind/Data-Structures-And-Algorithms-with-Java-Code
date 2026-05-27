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
        int maxEle = -(int) 1e9;  // Integer.MIN_VALUE

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

    public static int find(int[] arr, int data){

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }

    public static void reverseOfArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void inverseOfArray(int[] arr){
        int n = arr.length;
        int[] ans  = new int[n];
        for(int i=0 ; i<n ; i++){
            ans[arr[i]] = i;
        }
    }

    public static int spanOfArray(int[] arr){
        int maxEle = -(int)1e9;
        int minEle = (int)1e9;

        for(int ele:arr){
            maxEle = Math.max(maxEle,ele);
            minEle = Math.min(minEle,ele);
        }
        return maxEle - minEle;
    }

    public static int[] rotateOfArray(int[] arr, int r){
        int n = arr.length;
        r %= n;
        if( r<0 ){
            r += n;
        }

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int idx = (i+r) % n;
            ans[idx] = arr[i];
        }
        return ans;
    }

    public static void reverseOfArray(int[] arr, int i, int j){
        int n = arr.length;
        
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static int[] rotateOfArray2(int arr, int r){
        int n = arr.length
        r %= n;
        if(r<0){
            r +=n;
        }
        reverseOfArray(arr, 0, n-1);
        reverseOfArray(arr, 0, r-1);
        reverseOfArray(arr, r, n-1);
    }

    public static void sumOfTwoArray(int[] arr1, int[] arr2){
       int n = arr1.length;
       int m = arr2.length;
       int p = Math.max(n,m)+1;

       int[] ans = new int[p];

       int i = n-1, j = m-1, k=p-1, carry=0;
       while(k>=0){
        int sum = carry + (i>=0?arr1[i]:0)+(j>=0?arr2[j]:0);
        ans[k] = sum%10;
        carry = sum/10;

        i--;
        j--;
        k--;
       }

        for(int idx=0; idx < p; idx++){
            if(idx ==0 && ans[idx] == 0){
                continue;
            }
            System.out.println(ans[idx]);
        }

    }


    public static void main(String[] args){
        int n = sc.nextInt();
        // test1(n);
        // int[] arr = new int[n];
        // input(arr);
        int[] arr = input2(n);
        // int data = sc.nextInt();
        // display2(arr);
        // System.out.println(maximum(arr));
        // System.out.println(minimum(arr));
        // System.out.println(find(arr,data));
        // reverseOfArray(arr);;
        // display(arr);
        System.out.println(spanOfArray(arr));
        
    }
}