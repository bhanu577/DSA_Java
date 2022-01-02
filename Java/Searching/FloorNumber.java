import javax.xml.transform.TransformerFactoryConfigurationError;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={2,5,9,12,16,22,77,99};
        int target=3;
        int result=search(arr,target);
        System.out.println("The celling number "+result);
    }
    static int search(int[] arr,int target)
    {
        int start=0,end=arr.length;

        while(start<=end){
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
        //System.out.println(start+" "+end);
        return(arr[end]);
    }
}