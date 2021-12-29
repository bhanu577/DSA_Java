import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] tdArr=new int[3][3];
        //System.out.println("bhanu");
       for(int i=0;i<tdArr.length;i++){
           //tdArr[i]=new int[];
           for(int j=0;j<3;j++){
               tdArr[i][j]=s.nextInt();
           }
       }
       for(int[] i:tdArr){
       System.out.println(Arrays.toString(i));
       }
    }
    
}
