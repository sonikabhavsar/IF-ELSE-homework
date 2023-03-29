import java.util.Scanner;

public class CalculatorSymbols {

    //use the symbols to find arithmetic calculation
    //use  static main method
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the first number");
        int a =scanner.nextInt();
        System.out.println("enter the second number");
        int b = scanner.nextInt();
        System.out.println("choose Operator [1] - Addition -[2]-minus [3]-multiply [4]-divide");
        int ch =scanner.nextInt();
        //Use if-else statement
        if (ch==1){
            System.out.println("Answer:" + (a+b));
        } else if (ch==2) {
            System.out.println("Answer:" + (a-b));

        } else if (ch==3) {
            System.out.println("Answer:" + (a*b));

        } else if (ch==4) {
            System.out.println("Answer:" + (a/b));

        }

    }
    }






