
public class BinaryDemo {

public static int binarySearch(int arr[], int item){
    int start =0;
    int end = arr.length-1;
    while(start<=end){
        int mid = (start+end)/2;
        if (arr[mid]==item) {
            return mid;
        }
        if(arr[mid]<item){
            
            start= mid +1;
        }else{
            end = mid-1;
        }
    }

    return -1;
}
    public static void main(String[] args) {
        int item = 21;
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(binarySearch(arr,item));
        
    }
}
