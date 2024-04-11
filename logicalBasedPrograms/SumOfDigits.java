package logicalBasedPrograms;

public class SumOfDigits {
    public static void print(int num){
        int sum=0;
        while (num!=0) {
           int rem = num%10;
           sum+=rem;
           num/=10; 
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        print(123);
    }
}
