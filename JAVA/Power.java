import java.util.Scanner;
public class Power { 
  public static void main(String[] args) {
  Scanner Sc = new Scanner(System.in);
  int a = Sc.nextInt();
  int b = Sc.nextInt();
  double c = Math.pow(a, b);
  System.out.println(c);
  }
}
