import java.util.Scanner;

public class NameOfCity {
    //To Check the city name to use alphabetical letter
    //Use  static main method
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a letter from A TO F: ");
       char letter = input.next().charAt(0);
       //use if-else substance

       if (letter == 'A'){
        System.out.println("Ahmedabad");
    } else if (letter =='B') {
           System.out.println("Bhavnagar");

       } else if (letter =='C'){
           System.out.println("Chennai");
       } else if (letter =='D'){
           System.out.println("Delhi");
       } else if (letter == 'E'){
           System.out.println("Ellora");
       } else if (letter == 'F'){
           System.out.println("Firozabad");
       }else {
           System.out.println("Invalid entry");


    }
}
}