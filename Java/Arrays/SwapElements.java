import java.util.Arrays;

import javax.swing.text.html.MinimalHTMLWriter;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr={1,45,26,834,78};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] ar,int index1,int index2){
        int temp=ar[index1];
        ar[index1]=ar[index2];
        ar[index2]=temp;
    }
}
