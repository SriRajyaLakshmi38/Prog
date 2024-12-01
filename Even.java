import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }  
    }
    
}
