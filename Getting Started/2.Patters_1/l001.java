public class l001{

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
\
    public static void main(String[] args){
        // pattern(5);
        triangle(5);
    }
}