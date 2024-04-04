package patternPrinting;
public class Pattern1 {
    public static void printPattern(int n){
        int stars =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=n/2){
                stars++;
            }else{
                stars--;
            }
        }
    }
    public static void main(String[] args) {
        int n =7;
        printPattern(n);
    }
}
