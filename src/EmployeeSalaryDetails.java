import java.util.Scanner;

public class EmployeeSalaryDetails {
    static Scanner scanner = new Scanner(System.in);
    //Check Employee details with salary and  allowances and Gross pay
    //main method
    public static void main(String[] args) {
        System.out.println("enter your Name");

        String name =scanner.nextLine();

        System.out.println("enter your Id");
        int id = scanner.nextInt();

        System.out.println("enter your Basic Salary");
        double BasicSalary =scanner.nextDouble();
        double HRA,DA,TA,PF,Gross;
        HRA = BasicSalary * 0.10;
        System.out.println("This is HRA:" + HRA);
        DA =BasicSalary*0.08;
        System.out.println("This is DA:" + DA);
        TA = BasicSalary*0.09;
        System.out.println("This is TA:" + TA);
        PF = BasicSalary*0.20;
        System.out.println("This is PF:" +PF);
        Gross= HRA+DA+TA+PF;
        System.out.println("This is Gross Salary:" + Gross);






    }
}
