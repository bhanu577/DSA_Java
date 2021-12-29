import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={45,23,78,93,12};
        System.out.println("Before Reverse.."+Arrays.toString(arr));
        Reverse(arr,0,arr.length-1);
        System.out.println("After Reverse.."+Arrays.toString(arr));
    }
    static void Reverse(int[] ar,int start,int end){
        if(ar==null){
            System.out.println("Array is empty");
        }
        while(start<end){
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;
            end--;
        }
    }
}
