import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(binom(num1, num2));
    }
    private static int binom(int num1, int num2) {
        if (num2 == num1 || num2 == 0) return 1;
        return binom(num1 - 1, num2 - 1) + binom(num1 - 1, num2);
    }
}
