import java.util.*;

public class LinearDemo {
    public static int linear(int arr[],int item ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int item =0;
        int arr[] = {12,34,556,12,1,5};
        System.out.println("Enter element to search");
        Scanner sc = new Scanner(System.in);
        item = sc.nextInt();
      int res =  linear(arr,item);
      if(res==-1){
        System.out.println("Element not found");
      }else{
        System.out.println(arr[res]+" found at index "+res);
      }
        
      sc.close();
    }

}