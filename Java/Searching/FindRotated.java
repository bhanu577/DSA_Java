public class FindRotated {
    Solution s=new Solution();
    int[] arr={4,5,6,7,0,1,2};
    int tar=0;
    s.search(arr,tar);
}
class Solution {
    public void search(int[] nums,int target) {
        int pivot=pivotIndex(nums);
        int arr1Res=searchIndex(nums,target,0,pivot);
        int arr2res=searchIndex(nums,target,pivot+1,nums.length);
        if(arr1Res>0){
            return arr1Res;
        }
        else if(arr2Res>0){
            return arr2Res;
        }
        else{
            return -1;
        }
    }


    public int pivotIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return mid;
    }

    public int searchIndex(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}