package cp;

import java.text.NumberFormat;
import java.util.Scanner;

public class CarPayment {
	
	public static double calculateCarPayment (int carCost, int loanAmt, int downPayment, int termYears, double interestRate) {
			
		
		interestRate /= 100.0 ;
		
		double interestMonthly = interestRate / 12.0 ;
		
		int termMonths = termYears * 12 ;
		
		double monthlyPayment = 
		         (loanAmt * interestMonthly) / 
		            (1-Math.pow(1+interestMonthly, -termMonths));
		
		return monthlyPayment;
			}
		
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter amount of loan: ");
		int loanAmt = scanner.nextInt();
		
		System.out.println("Enter loan length (in years): ");
		int termYears = scanner.nextInt();
		
		System.out.println("Enter interest rate: ");
		double interestRate = scanner.nextDouble();
		
		double monthlyPayment = 
				calculateMonthlyPayment(loanAmt, termYears, interestRate);
		
		NumberFormat currencyForm =
				NumberFormat.getCurrencyInstance();
		NumberFormat interestFormat = 
				NumberFormat.getPercentInstance();
		
		System.out.println("Loan Amount: "+
		         currencyForm.format(loanAmt));
		System.out.println("Loan Term: "+
		         termYears+" years");
		System.out.println("Interest Rate: "+
		         interestFormat.format(interestRate));
		System.out.println("Monthly Payment: "+
		         currencyForm.format(monthlyPayment));
		

		}

	private static double calculateMonthlyPayment(int loanAmt, int termYears, double interestRate) {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
	}