package logicalBasedPrograms;

public class OddEven {
    public static void print(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else if(num%2==1){
            System.out.println(num+" is odd");
        }else{
            System.out.println(num+" is negative");
        }
    }
    public static void main(String[] args) {
        print(-1);
    }
}
