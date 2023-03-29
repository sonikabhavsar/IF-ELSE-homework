import java.util.Scanner;

public class AverageNumbers {
    //Find out the average of any five number
    // use static main method
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number:" +"/n" +"Enter second number:" + "Enter third number" + "Enter fourth number" + "Enter fifth number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        System.out.println("Average of five number is:" +(number1+number2+number3+number4+number5)/5);

    }
}
