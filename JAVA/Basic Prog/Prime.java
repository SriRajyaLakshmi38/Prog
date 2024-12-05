
import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    int n = SC.nextInt();

    int cnt = 1;
    for (int i = 2; i < (n/2); i++) {

            if (n%i == 0) {
                cnt++;
            }
        }
    if (cnt >= 2) {
        System.out.println("Non-Prime");
    } else {
        System.out.println("Prime");
    }
}

}
