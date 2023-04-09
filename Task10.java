import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(gcd_recurs(num1, num2));
    }

    private static int gcd_recurs(int num1, int num2) {
        if (num1 == num2) return num1;
        return num1 > num2 ? gcd_recurs(num1 - num2, num2) : gcd_recurs(num1, num2 - num1);

    }
}
