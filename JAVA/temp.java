import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        double C = Sc.nextDouble();
        double F = Sc.nextDouble();

        //To convert Celsius from Fahrenheit
        double CF = (F - 32) * 5/9;
        System.out.println(CF);
         //To convert Celsius from Fahrenheit
        double FC = (C * 9/5) + 32;
        System.out.println(FC);
    }

    }

