/* 
 * By - Jonathan Vazquez
 * On - 10/14/2023
 * For - Calculates monthly payments for a car loan
*/

public class CarLoan{
    public static void main(String[] args){
        int carLoan = 27675;
        int loanLength = 6;
        double interestRate = 7.75;
        int downPayment = 0;

        if(loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");
        } else if(downPayment >= carLoan){
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance/months;
            double interest = (monthlyBalance * interestRate)/100;
            double monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}