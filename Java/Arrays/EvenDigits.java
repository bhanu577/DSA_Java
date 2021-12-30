
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int len=(int)(Math.log10(nums[i])+1);
            if(len%2==0){
                count++;
            }
        }
        return(count);
    }
}
public class EvenDigits{
    public static void main(String[] args) {
        
    Solution so=new Solution();
    int[] arr={12,56,345,1,10,78};
    int result=so.findNumbers(arr);
    System.out.print("The number of even number digits are :.."+result);
}
}