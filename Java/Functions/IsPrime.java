import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to check prime or not....");
        int num=s.nextInt();
        boolean result=prime(num);
        if(result){
            System.out.println("Is Prime Number");
        }
        else{
            System.out.println("Is not Prime Number");
        }
    }

    static boolean prime(int num){
        int c=2;
        if(num<=1){
            return false;
        }
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return c*c>num;
    }
    
}
