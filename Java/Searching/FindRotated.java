import java.util.*;
public class FindRotated {
    public static void main(String[] args) {
        Solution s=new Solution();
    int[] arr={4,5,6,7,0,1,2};
    int res=s.search(arr,5);
    System.out.println(res);
    }
    
}
class Solution {
    public int search(int[] nums,int target) {
        int pivot=pivotIndex(nums);
        //System.out.println(pivot);
        if(pivot==-1){
            return searchIndex(nums,target,0,nums.length-1);
        }
        
        if(target==nums[pivot]){
            return pivot;
        }
        if(target>=nums[0]){
            return searchIndex(nums,target,0,pivot-1);
        }
            return searchIndex(nums,target,pivot+1,nums.length-1);
    }


    public int pivotIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
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