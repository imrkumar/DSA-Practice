package patternPrinting;

public class Pyramid {
    public static void pyramid(int n){
        int stars =1;
        int spaces=n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=stars;k++){
                System.out.print("*");
            }
            stars+=2;
            spaces--;
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n =5;
        pyramid(n);
    }
}
