import java.util.Scanner;

public class StudentResultStatus {
    Scanner scanner = new Scanner(System.in);
    //student pass if you get more than 35 marks in subject

    public void studentResultStatus() {
        System.out.println("\"maths marks:\"+\"\\n\"+\"eng marks:\"+\"\\n\"+\"sci marks:\"");
        float avg;
        int mathsMarks = scanner.nextInt();
        int engMarks = scanner.nextInt();
        int sciMarks = scanner.nextInt();
        int total = (mathsMarks + engMarks + sciMarks);
        avg = ((total / 3));
        System.out.println("your overall percentage"
                + "is" + avg);
        // //Use if-else statement
        if (((avg >= 35) && (mathsMarks >= 35
        ) && (engMarks >= 35) && (sciMarks >= 35))) {
            ;


            System.out.println("Congratulation you are been pass");

        } else{
            System.out.println("Sorry you are been fail");


        }
    }

    public static void main(String[] args) {
        // To call non-static method in static area creating class object
       StudentResultStatus studentResultStatus =new StudentResultStatus();
        //calling method using class object
        studentResultStatus.studentResultStatus();
    }
}
