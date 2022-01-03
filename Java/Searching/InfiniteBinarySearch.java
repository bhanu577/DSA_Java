public class InfiniteBinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,10,77,99,123,145,167,187,200,300,321};
        int target=85;
        int result=ans(arr,target);
        if(result>=0){
            System.out.println("The target value "+ target+" found @ "+result);
        }
        else{
            System.out.println("Target value not found");
        }
    }
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        try{
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
    }
    catch(Exception e){

    }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            //int mid=(start+end)/2; using these divide rule while doing binary search when you do not know the array size then the program throws an error that index out of range follow better approach 
            int mid = start+(end-start)/2; // will no throw any error if the end index is out of range.
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
