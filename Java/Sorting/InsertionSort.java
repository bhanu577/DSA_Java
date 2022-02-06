import java.util.Arrays;

class InsertionSort{
    public static void main(String args[]){
        int[] arr={1,20,3,2,5,9,22};
        insertSort(arr);
    }
    static void insertSort(int[] ar){
        int n=ar.length;
        for(int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>key){
                ar[j+1]=ar[j];
                j-=1;
            }
        ar[j+1]=key;
        }
        System.out.print(Arrays.toString(ar));
    }
}