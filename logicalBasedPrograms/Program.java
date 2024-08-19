package logicalBasedPrograms;

public class Program {
    public static void print(String name){
        for(int i =0;i<name.length();i++){
            if (name.charAt(i)>='A' && name.charAt(i)<='Z') {
                System.out.println((char) (name.charAt(i)+ 32));
            }else if (name.charAt(i)>='a' && name.charAt(i)<='z') {
                System.out.println((char)(name.charAt(i)-32));
            }
        }
    }
    public static void main(String[] args) {
        print("Rahul");
    }
}
