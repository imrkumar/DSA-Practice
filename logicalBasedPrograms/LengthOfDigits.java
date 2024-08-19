package logicalBasedPrograms;

public class LengthOfDigits {
    public static void approachOne(int num){
        int count =0;
        while(num!=0){
            num /= 10;
            count++;
        }
        System.out.println("Length of digits: " + count);
    }
    // public static void approachTwo(int num){
    //     String str = Integer.toString(num);
    //     System.out.println("Length of digits: " + str.length());
    // }
    public static void main(String[] args) {
        approachOne(123456789);
        // approachTwo(455);
    }
}
