import java.util.Scanner;
import java.util.concurrent.Callable;

public class CheckNumbers {
    //To Check the number is positive or negative or zero
    Scanner scanner =new Scanner(System.in);
    public  void CheckNumbers(){
        int number=scanner.nextInt();
        // //Use if-else statement
        if (number>0){
            System.out.println(number
            +"is a positive number");
        } else if (number<0) {
            System.out.println(number + "is a negative number");

        }else {
            System.out.println(number +"is a zero number");

        }
    }

    public static void main(String[] args) {
        // To call non-static method in static area creating class object
        CheckNumbers checkNumbers =new CheckNumbers();
        //calling method (using the class object)
        checkNumbers.CheckNumbers();






    }
}
