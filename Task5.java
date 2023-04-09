import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num , one , no ;
        num = scan.nextInt();
        no = 0;
        one = 1;
        if (num == 0) System.out.println(0);
        else System.out.println(fibo(no,one,num - 1));
    }

    private static int fibo(int no , int one, int num) {
        int slot = no + one;
        no = one;
        one = slot;
        if(num < 1) return no;
        return fibo(no,one,num - 1);
    }
}
