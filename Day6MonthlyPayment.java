import java.util.*;
public class Day6MonthlyPayment{
    public static void main(String []args){
        
        double P, R, Y, EMI;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        P = sc.nextDouble();

        System.out.print("Enter the updated rate : ");
        R = sc.nextDouble();

        System.out.print("Enter number of years : ");
        Y = sc.nextDouble();

        // Rate
        double r =R/(12*100);
        // Total years 
        double Total_years= Y*12;
        
// The Math.pow() method is used calculate values raised to a power
// calculating the monthly EMI payment 
        EMI= (P*r)/(1-Math.pow(1+r,-Y));

        // double monthlyPayment =(loanAmount*monthlyRate)/(1-Math.pow(1+monthlyRate, -termInMonths));
// Displaying the EMI amount
        System.out.print("Monthly EMI is= "+EMI+"\n");

    }
}