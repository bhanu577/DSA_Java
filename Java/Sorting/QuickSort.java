import java.util.Arrays;

class QuickSort{
    static int partition(int[] A,int start,int end){
        int pivot=A[start];
        int i=start;
        for(int j=i+1;j<=end;j++){
            if(A[j]<pivot){
                i=i+1;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int temp1=A[i];
        A[i]=A[start];
        A[start]=temp1;
        return i;

    }
    static void quickSort(int[] A,int start,int end){
        if(start<end){
            int midpoint=partition(A,start,end);
            //System.out.println(midpoint);
            quickSort(A,start,midpoint-1);
            quickSort(A, midpoint+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr={23,12,4,56,2,78,13,100,22,89};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}