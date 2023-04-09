import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, pow;
        num = scan.nextInt();
        pow = scan.nextInt();
        System.out.println(power(num, pow));
    }

    private static int power(int num,int pow) {
        if ( pow == 0) return 1;
        return num * power(num,pow -1);
    }
}

