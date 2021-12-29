public class MaxElement {
    public static void main(String[] args) {
        int[] arr={23,56,78,123,45,1};
        int maxElement=Max(arr);
        System.out.println(maxElement);
    }
    static int Max(int[] ar){
        int max=0;
        for(int i=0;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;
    }
    
}
