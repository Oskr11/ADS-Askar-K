import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        int n = ok.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++) {
            ar[i] = ok.nextInt();
        }
        System.out.println(min(ar));
    }
    private static int min(int[] ar) {
        return recurs(ar, ar.length - 1, Integer.MAX_VALUE);
    }
    private static int recurs(int[] ar, int n, int min) {
        if(n < 0) return min;
        min = Math.min(min, ar[n]);
        return recurs(ar, n - 1, min);
    }
}
