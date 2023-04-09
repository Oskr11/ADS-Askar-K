import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int m = str.length();
        if (m == 0) System.out.println(0);
        else Permutation(str);
    }
    private static void Permutation (String str){
        recurs (str, " ", 0);
    }
    private static int recurs (String str,String w, int k){
        if (k == str.length()) return recurs (str, w, str.length());
        char hi = str.charAt(k);
              String hey =  str.substring(0, k) + str.substring(k + 1);
             return recurs (hey, w + hi, k + 1);
    }
}
