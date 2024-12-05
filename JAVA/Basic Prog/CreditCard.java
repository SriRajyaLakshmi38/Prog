import java.util.Scanner;

class CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the credit card number:");
        String cardNumber = scanner.nextLine(); // Read input as a String

        // Check if the input is numeric and exactly 16 digits long
        if (cardNumber.length() == 16 && cardNumber.matches("\\d+")) {
            // Check if the first digit is not '0'
            if (cardNumber.charAt(0) != '0') {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
        } else {
            System.out.println("Not Valid");
        }

        scanner.close();
    }
}
