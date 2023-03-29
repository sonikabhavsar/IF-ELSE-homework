import java.util.Scanner;

public class EligibleForVote {

        Scanner scanner = new Scanner(System.in);
        //Find out your age is eligible for vote or not

        public void eligibleForVote(){
            //acknowledge the user what to enter
            System.out.println("please enter you age in inter value");
            //storing age in variable using scanner object
            int age =scanner.nextInt();
            // //Use if-else statement

            if(age>=18){
                System.out.println("you are eligible for vote as you age is :"+age);

            }else {
                System.out.println("you are not eligible for vote as you age is:"+age);
            }
        }

        public static void main(String[] args) {
            //crating class object to call non-static method in static area
            EligibleForVote eligibleForVote = new EligibleForVote();
            //calling method using class object
           eligibleForVote.eligibleForVote();


        }
}
