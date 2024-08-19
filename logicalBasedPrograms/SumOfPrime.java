package logicalBasedPrograms;

import java.util.Scanner;

public class SumOfPrime {
    public static boolean isPrime (int num){
        if (num==2 || num ==3 || num == 5 || num == 7) {
          return true;
        }
        return false;
    }
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int  num = scn.nextInt();
        int sum =0;
        while (num!=0) {
            int rem = num%10;
            if(isPrime(rem)){
                sum += rem;
            }
            num = num/ 10;
        }
        System.out.println("sum: " + sum);
    }
}
