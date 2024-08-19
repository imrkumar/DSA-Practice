package patternPrinting;

public class DiamondPattern {
    public static void print(int n){
        for(int i=1;i<=n*2-1;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            
        }
    }
    public static void main(String[] args) {
        
    }
}
