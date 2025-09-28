import java.util.*;

public class pattern{

//cst => count of stars
//nst => no. of stars

    public static Scanner sc = new Scanner(System.in);

    public static void printSquare(int n){
        int nst = n;
        for(int row = 1; row <=n ; row++){
            for(int cst = 1; cst<=nst ; cst++){
                System.out.print("*");
            }
            nst = n;
            System.out.println();
        }
    }

    public static void printTriangle(int n){
        int nst = 1;
        for(int row = 1 ; row<=n;row++){
            for(int cst = 1; cst<=nst ; cst++){
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
    }

    

    public static void main(String[] args){
        // System.out.println("hello ji");
        int n = sc.nextInt();
        // printSquare(n);
        printTriangle(n);
    }
}