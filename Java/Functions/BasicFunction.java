import java.util.Scanner;

public class BasicFunction{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        sum(a,b);
    }
    static void sum(int num1,int num2){
        int c=num1+num2;
        System.out.println(c);
    }
}