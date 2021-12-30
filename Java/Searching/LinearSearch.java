public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,45,27,89,123,99};
        int target=89;
        int result=searchLinear(arr,target);
        if(result>0){
            System.out.println("The value "+target+" is found at index "+result);
        }
        else{
            System.out.println("The value in not found in the array");
        }
    }

    static int searchLinear(int[] arr,int target)
    {
        if(arr.length==0){
            return(-1);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return(i);
            }
        }
        return(-1);
    }
    
}
