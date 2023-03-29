import java.util.Scanner;

public class SellerSalesCommission {
    //Check the seller details to  sales amount with sales commission
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter seller name" + "/n" + "enter seller Id" + "/n" + "enter seller amount" + "/n" + "enter basic salary");
        String sellerName = scanner.next();
        int salesId = scanner.nextInt();
        double salesAmount =scanner.nextInt();
        double basicSalary =scanner.nextDouble();
        //use if-else statement
        if (salesAmount<10000){
            System.out.println("your Commission is " + (salesAmount*0.02));
        } else if (salesAmount>=10000) {
            System.out.println("your Commission is " + (salesAmount*0.05));

        } else if (salesAmount>=20000) {
            System.out.println("your Commission is" + (salesAmount*0.10));

        } else if (salesAmount>=30000) {
            System.out.println("your Commission is" + (salesAmount*0.20));

        } else if (salesAmount>=50000) {
            System.out.println("your Commission is" + (salesAmount*0.35));

        }
    }
}
