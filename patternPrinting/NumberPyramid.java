package patternPrinting;
import java.util.*;
public class NumberPyramid {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scn.nextInt();
        pyramid(n);
        scn.close();
    }
}
