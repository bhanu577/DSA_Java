import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numberRange=s.nextInt();
        int number1=0;
        int number2=1;
        int Fib=0;
        if(numberRange==number1){
            System.out.println(number1);
        }
        else if(numberRange==number2){
            System.out.println(number2);
        }
        else{
            for(int i=2;i<=numberRange;i++){
                Fib=number1+number2;
                number1=number2;
                number2=Fib;
            }
            System.out.println(Fib);
        }
    }
}