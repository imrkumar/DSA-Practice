package logicalBasedPrograms;

public class SumOfDigitDivisibleByThree {
    public static void main(String[] args) {
        int n =98234;
        int sum = 0;
        while (n!=0) {
            int rem = n%10;
            if(rem%3==0){
                sum += rem;
            }
            n/=10;
        }
        System.out.println("Sum of digits divisible by 3: "+sum);
    }
}
