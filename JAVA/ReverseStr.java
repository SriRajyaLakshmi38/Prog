
import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String S = Sc.nextLine();
        String R = "";
        int l = S.length() ;
        for (int i = l-1; i >= 0; i--) {
            R += S.charAt(i);
        }
            System.out.println(R);
        }
}
    
    
