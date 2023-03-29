import java.util.Scanner;

public class ChangeLowerCaseMethod {
    //To change any alphabet in uppercase to lowercase
    Scanner scanner =new Scanner(System.in);
    // static main method
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("change the alphabet" + "is");
        System.out.println(name.toLowerCase());

    }
}
