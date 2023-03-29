import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    Scanner scanner = new Scanner(System.in);
    public void checkLeapYear() {
        //Find out if is leap year or not
        System.out.println("please enter 4 digit of year (e.g.= 1996)");
        int year = scanner.nextInt();
        //exactly divided by 4(such as 2000 ,2004 ,2008,etc..)
        //exactly divided by 100(such as 2000 ,2100 ,2200,etc..)
        //exactly divided by 400(such as 2000 ,2400 ,2800,etc..)

         //Use if-else statement
        if(((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)))
        {

            System.out.println("Leap Year" + " " + year);
        }
        else {
            System.out.println("Not Leap Year" +" " + year);
        }
    }

    public static void main(String[] args) {
        // To call non-static method in static area creating class object
        LeapYear leapYear =new LeapYear();
                //calling method (using the class object)
        leapYear.checkLeapYear();
    }


    }
