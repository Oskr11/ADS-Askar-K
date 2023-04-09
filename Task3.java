import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sev;
        sev = 7;
        num = scan.nextInt();
        if (num == 2 || num == 3 || num == 5 || num == 7 || prime(num,sev) == 1)
            System.out.println("Prime");
        else if (prime(num,sev) == 0 || num == 1) System.out.println("Composite");

    }
    private static int prime (int num, int sev) {
        if (sev < 2) return  1;
        if (num % sev == 0) return 0;
        else return prime (num , sev  - 1);
    }
}
