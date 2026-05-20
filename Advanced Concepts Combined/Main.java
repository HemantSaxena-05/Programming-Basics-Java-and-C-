class MathUtility {

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int gcd(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }
}

public class Main {
    public static void main(String[] args) {

        MathUtility obj = new MathUtility();

        int result1 = obj.gcd(12, 18);
        int result2 = obj.gcd(15, 19, 27);

        System.out.println("GCD of 2 numbers: " + result1);
        System.out.println("GCD of 3 numbers: " + result2);
    }
}