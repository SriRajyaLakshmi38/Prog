
import java.util.Scanner;

public class Factors {
   public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int n = SC.nextInt();
    int[] factors = new int[n];
    int cnt = 0;
    for (int i = 1; i <= (n/2); i++) {
        if (n%i == 0){
            factors[cnt] = i;
            //System.out.println(factors);err
            //System.out.printf("%d %d %d%n", 1, i, n);
            cnt++;
        }
    }
    for (int i = 0; i < cnt; i++) {
        System.out.print(factors[i] + " ");
    SC.close();
   }
}
}













