import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        System.out.println(factor(num));
    }
    private static int factor (int num) {
        if (num <= 1) return 1;
        return num * factor(num - 1);
    }
}
