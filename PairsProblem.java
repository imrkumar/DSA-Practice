public class PairsProblem {
    public static void printPairs(int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println(count+" pairs found");
    }
  public static void main(String[] args) {
    int arr[]={2,3,4,5};
    printPairs(arr);
  }  
}
