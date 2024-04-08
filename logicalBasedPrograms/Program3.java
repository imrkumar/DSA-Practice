package logicalBasedPrograms;

public class Program3 {
    public static void print(int num){
        if(num%2==1){
            System.out.println("Weird");
        }else if((num%2==0) && (num>=2 || num<=5)){
            System.out.println("Not Weird");
        }else if ((num%2==0) && (num>=6 || num<=20)) {
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
    public static void main(String[] args) {
        print(70);
    }
}
