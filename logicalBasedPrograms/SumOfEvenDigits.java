package logicalBasedPrograms;

public class SumOfEvenDigits {
    public static void print(int num){
        int sum =0;
        while (num!=0) {
            int rem = num % 10;
            if(rem%2==0){
                sum += rem;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        print(1234);
    }
}
