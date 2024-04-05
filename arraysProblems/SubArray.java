public class SubArray {
    public static void subArray(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int start =i;
            
            for(int j=i;j<arr.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        subArray(arr);
    }
}
