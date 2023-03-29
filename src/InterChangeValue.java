import java.util.Scanner;

public class InterChangeValue {
    //TO find interchanging the value of  two numbers
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //a and b are to interchange
        int a,b,c;
        System.out.println("Enter the value of a and b");
        a =scanner.nextInt();
        b =scanner.nextInt();
        System.out.println("before interchanging number:" + a +" " + b);
        // interchanging  value
        c = a;
        a = b;
        b = c;
        System.out.println("After interchanging number:" + a + " " + b);
    }
}
