import javax.xml.transform.TransformerFactoryConfigurationError;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,9,12,16,22,77,99};
        int target=77;
        int result=search(arr,target);
        if(result>0){
            System.out.println("The target value "+ target+" found @ "+result);
        }
        else{
            System.out.println("Target value not found");
        }
    }
    static int search(int[] arr,int target)
    {
        int start=0,end=arr.length;

        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return(-1);
    }
}