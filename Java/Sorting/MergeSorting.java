import java.util.Arrays;

class MergeSorting{

    //Conqure or merge function

    static void merge(int[] arr,int p,int mid,int q){
        int n1=mid-p+1;
        int n2=q-mid;
        //creating temporary array
        int[] L=new int[n1];
        int[] R=new int[n2];
        //copying original values in array arr and placing them in temporary array
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[p+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=p;
        // for here merge function starts
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;k++;
        }
    }

    //Divide the array function

    static void mergeSort(int arr[],int p,int q){
        if(p<q){
            int mid=(p+q)/2; // always take floor value
            mergeSort(arr, p, mid);
            mergeSort(arr, mid+1, q);
            merge(arr,p,mid,q);
        }
    }

    //Main Function
    public static void main(String[] args) {
        int[] arr={6,55,3,100,8,77,2,4};
        int first=0;
        int last=arr.length-1;
        System.out.println("Before Sorting:"+Arrays.toString(arr));
        mergeSort(arr,first,last);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }
}