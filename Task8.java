import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (Non_digit(str) == true)
            System.out.println("No");
        else System.out.println("Yes");

    }
    private static boolean Non_digit (String str){
        return recurs (str , 0);

    }
    private static boolean recurs (String str, int k){
        if(k == str.length()) return false;
        return str.charAt(k) < '0' || str.charAt(k) > '9' ? true : recurs(str , k + 1);

    }
}




