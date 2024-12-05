
import java.util.Scanner;

class SumOfDig{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int sum = 0;
        while (n>10) { 
            int r = n%10;
            //System.out.println(r);
            sum = sum+r;
            //System.out.println(sum);
            n = n/10;
            //System.out.println(n);
        }
        sum = sum+n;
        System.out.println(sum);  
    }
   

}