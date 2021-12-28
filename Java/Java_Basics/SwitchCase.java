import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String fruit=s.next();
        switch(fruit){
            case "mango":
                System.out.println("Mango is king of fruits");
                break;
            case "apple":
                System.out.println("Apple keeps healthy fruit");
                break;
            default:
                System.out.println("wrong fruit entered");
        }
    }
}
