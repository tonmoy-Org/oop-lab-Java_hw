public class Problem {
    public static void main(String[] args) {
        int A = 5;
        int B = 6;
        int C = 7;
        int D = 8;

        // output
        System.out.println("a = "+ (A*B - C*D));
        System.out.println("b = "+ ((2*A )- B + (3*D)));
        System.out.println("c = "+ ((A*A) +(B*B )- (C*C) + (D*D)));

        // System.out.println("d = "+ (Math.pow(A,3) + B - Math.pow(C,2)));
        System.out.println("d = "+ ((A*A*A) + B - (C*C)));
    }
}