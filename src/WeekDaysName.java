import java.util.Scanner;

public class WeekDaysName {
    //weekdays name check to use number
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter the number  1 to 7");
        int a =scanner.nextInt();
        // //Use if-else statement
        if (a==1){
            System.out.println("Today is Monday");

        } else if (a==2) {
            System.out.println("Today is Tuesday");

        } else if (a==3) {
            System.out.println("Today is Wednesday");

        } else if (a==4) {
            System.out.println("Today is Thursday");

        } else if (a==5) {
            System.out.println("Today is Friday");

        } else if (a==6) {
            System.out.println("Today is Saturday");

        } else if (a==7) {
            System.out.println("Today is Saturday");

        }
    }
}
