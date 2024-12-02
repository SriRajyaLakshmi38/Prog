import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Give Year");
        int leapyear = Obj.nextInt();

        if (leapyear%4 == 0 && leapyear% 100 != 0 || (leapyear % 400 == 0)){
            System.out.println("Year is Leap "+(leapyear));
        }
        else{
            System.out.println("Year is not Leap" +(leapyear));
        }
    }
}
