import java.util.Scanner;

public class EnterAnyValue {
//To check any value is Alphabet or Digit or Special Character
    public  void EnterAnyValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value");
        char ch =scanner.next().charAt(0);
        // //Use if-else statement
        if ((ch >='A' && ch <='Z') || (ch>='a' && ch <='z')){
            System.out.println(ch + " is a Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");

        }else {
            System.out.println(ch + " is a Special Character.");
        }
    }

    public static void main(String[] args) {
        // To call non-static method in static area creating class object
        EnterAnyValue enterAnyValue =new EnterAnyValue();
        //calling method (using the class object)
        enterAnyValue.EnterAnyValue();
    }

}
