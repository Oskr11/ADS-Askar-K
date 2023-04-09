import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        int[] ar = new int[num];
        for (int i = 0; i < num; i++) {
            ar[i] = scan.nextInt();
        }
        float save = (int) sum(ar);

        System.out.println(save / num);
    }
    private static float sum (int[] ar){
        return recurs (ar, ar.length - 1, 0);
    }
    private static float recurs (int[] ar, int num, int avr ){
        if (num < 0) return avr;
        avr += ar[num];
        return recurs (ar, num -1 , avr);
    }



}
