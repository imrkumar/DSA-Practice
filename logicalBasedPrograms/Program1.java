package logicalBasedPrograms;

public class Program1 {
    public static void print(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                System.out.print((char)(str.charAt(i)+32));
            }else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                System.out.print((char)(str.charAt(i)-32));
            }
        }
    }
    public static void main(String[] args) {
        
        print("rahuL");
    }
}
