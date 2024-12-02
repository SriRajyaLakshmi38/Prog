import java.util.Scanner;

public class OddorEven{
   
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter num");
        int n= Obj.nextInt();

        if(n%2 == 0){
            System.out.println("Even");}
          else{
              System.out.println("Odd");
          }      

    }

}