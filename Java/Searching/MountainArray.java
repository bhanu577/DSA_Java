public class MountainArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr={0,1,2,4,2,1};
        int target=1;
        int t=s.peakIndexInMountainArray(arr);
        System.out.println(t);
        int index=s.search(arr,target,t);
        System.out.println(index);
    }
}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public int search(int[] arr,int target ,int t)
    {
        int start=0,end=t;

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
        return(-1);
}
}

