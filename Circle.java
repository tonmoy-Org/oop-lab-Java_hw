import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radious = sc.nextInt();
        double area = 3.1416*(Math.pow(radious, 2));
        System.out.println("Area = "+ String.format("%.2f", area));
    }
}