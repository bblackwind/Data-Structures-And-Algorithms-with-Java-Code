import java.util.*;

public class l001{


    public static Scanner sc = new Scanner(System.in);

    public static void square(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void triangle(int n){
        int nst = 1;
        for(int row = 1 ; row <= n ; row++){
            for(int cst = 1; cst <= nst ; cst++){
                System.out.print("*\t");
            }
            System.out.println();
            nst++;
        }
    }

    public static void invertedTriangle(int n){
        int nst = n;
        for(int row = 1; row <= n; row++){
            for(int cst = 1 ; cst <= nst ; cst++){
                System.out.print("*\t");
            }
            System.out.println();
            nst--;
        }
    }

    public static void mirrorTriangle(int n){
        int nst = 1;
        int nsp = n-1;

        for(int row =1; row <=n ; row++){
            for(int csp = 1; csp <= nsp ; csp++){
                System.out.print("\t");
            }
            for(int cst = 1 ; cst <= nst ; cst++){
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }

    public static void halfDiamond(int n){
        int nst = 1; 
        int nsp = n-1;

        for(int row=1 ; row<=n ; row++){
            for(int csp = 1 ; csp<=nsp ;csp++){
                System.out.print("\t");
            }

            for(int cst = 1 ; cst<=nst ; cst++){
                System.out.print("*\t");
            }

            System.out.println();
            nst+=2;
            nsp--;
        }
    }

    public static void main(String[] args){
        int n = sc.nextInt();
        // pattern(5);
        // triangle(5);
        // invertedTriangle(n);
        // mirrorTriangle(n);
        halfDiamond(n);
    }
}