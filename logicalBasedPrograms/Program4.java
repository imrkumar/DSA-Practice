package logicalBasedPrograms;

public class Program4 {
    public static void print(int sales){
        if(sales>=30 && sales<=50){
            System.out.println("D");
        }else if(sales>=51 && sales<=60){
            System.out.println("C");
        }else if(sales>=61 && sales<=80){
            System.out.println("B");
        }else if(sales>=81 && sales<=100){
            System.out.println("A");
        }else{
            System.out.println("Enter valid sales");
        }
    }
    public static void main(String[] args) {
        print(321);
    }
}
