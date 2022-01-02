import java.util.*;
public class FirstLast {
    public static void main(String[] args) {
        
    
    Solution s1=new Solution();
    int[] arr={1,1,2};
    int target=1;
    int[] th=s1.searchRange(arr,target);
    System.out.println(Arrays.toString(th));
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans={-1,-1};
        
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        
        return ans;
     
    }
    
    int search(int[] arr,int target,boolean firstIndex){
        int ans=-1;
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}