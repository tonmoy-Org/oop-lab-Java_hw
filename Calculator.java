import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Choice from 1 to 4 for calculation :");
        int option = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        //  you have to choice from 1 to 4 for calculation
        // output
        switch(option){
            case 1: System.out.println("Summation = "+ (a+b));
            break;
            case 2: System.out.println("Subtraction = "+ (a-b));
            break;
            case 3: System.out.println("Multiplication = "+ (a*b));
            break;
            case 4: if(b != 0){
                System.out.println("DIvision = "+ (a/b));
            }else{
                System.out.println("Math Error");
            }
            default: System.out.println(" Invalid Choice");
        }
    }
}