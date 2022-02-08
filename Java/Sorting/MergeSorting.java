import java.util.Arrays;

class MergeSorting{
    static void merge(int[] arr,int p,int mid,int q){
       // System.out.println(p+" "+mid+" "+q);
        int n1=mid-p+1;
        int n2=q-mid;

        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++)
        {
            L[i]=arr[p+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=p;
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
        //System.out.println(Arrays.toString(L));
        //System.out.println(Arrays.toString(R));

    }
    static void mergeSort(int arr[],int p,int q){
        if(p<q){
            int mid=(p+q)/2;
            mergeSort(arr, p, mid);
            mergeSort(arr, mid+1, q);
            merge(arr,p,mid,q);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,55,3,100,8,77,2,4};
        int first=0;
        int last=arr.length-1;
        System.out.println("Before Sorting:"+Arrays.toString(arr));
        mergeSort(arr,first,last);
        System.out.println("After Sorting:"+Arrays.toString(arr));
    }
}