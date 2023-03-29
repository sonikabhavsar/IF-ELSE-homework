import java.util.Scanner;

public class StudentResultDetails {
    Scanner scanner = new Scanner(System.in);
    //To check all student details with result
    public void StudentResult(){
        System.out.println("Enter your name:"+"\n"+"Roll number:"+"\n"+"maths marks:"+"\n"+"eng marks:"+"\n"+"sci marks:");
        String name = scanner.nextLine();
        int rollNumber = scanner.nextInt();
        int mathsMarks =scanner.nextInt();
        int engMarks = scanner.nextInt();
        int sciMarks = scanner.nextInt();
        int total = (mathsMarks+engMarks+sciMarks);
        double percentage;
        percentage =((total/3));
        System.out.println("total of the three subject is:"+ total);
        System.out.println("percentage of three subject is:"+ percentage);
         //Use if-else statement
        if (percentage>=70){
            System.out.println("your grade is: A+");

        } else if (percentage>=60) {
            System.out.println("your grade is: A");

        } else if (percentage>=50) {
            System.out.println("your grade is: B");

        } else if (percentage>=35) {
            System.out.println("your grade is: C");

        }else {
            System.out.println("your grade is: Fail");
        }
    }

    public static void main(String[] args) {
        // To call non-static method in static area creating class object
        StudentResultDetails studentResultDetails =new StudentResultDetails();
        //calling method using class object
        studentResultDetails.StudentResult();
    }

    }

