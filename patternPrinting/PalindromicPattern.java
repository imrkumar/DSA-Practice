package patternPrinting;

public class PalindromicPattern {
    public static void print(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int g=2;g<=i;g++){
                System.out.print(g);
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        print(7);
    }
}
