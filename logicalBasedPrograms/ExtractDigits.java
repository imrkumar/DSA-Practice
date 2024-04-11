package logicalBasedPrograms;

public class ExtractDigits {
    public static void print(int num){
        while(num!=0){
            int rem = num%10;
            System.out.print(rem+" ");
            num/=10;
        }
    }
    public static void main(String[] args) {
        print((123));
    }
}
