import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] str= new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=s.next();
        }

        System.out.println(Arrays.toString(str));
    }
    
}
