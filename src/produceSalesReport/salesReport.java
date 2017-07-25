package produceSalesReport;

import java.util.Scanner;

public class salesReport {

	public static void main(String[] args) {
		int customerNumber;
		String customerName;
		double salesAmt; 
		int taxCode; 
		double totalDue = 0.00; 
		double salesTax = 0.00; 
		String HEADING = "Sales Report"; 
		
		//create scanner to get required data points
		Scanner scan = new Scanner(System.in); 
		
		//get customer's number
		System.out.println("What is the customer's number?");
		customerNumber = scan.nextInt();
				
		//get customer's name 
		scan.nextLine();
		System.out.println("What is the customer's name? "); 
		customerName = scan.nextLine(); 
		
		//get sales amount 
		System.out.println("What is the sales amount?"); 
		salesAmt = scan.nextDouble(); 
		
		//get tax code
		System.out.println("What is their tax code?"); 
		taxCode = scan.nextInt(); 
		
		//use switch statement to determine which sales tax applies to customer 
		switch(taxCode) {
		case 0: // tax exempt 
			salesTax = 0.00;
			totalDue = salesAmt + salesTax; 
			break; 
		case 1: 
			salesTax = salesAmt * 0.03;
			totalDue = salesAmt + salesTax; 
			break;
		case 2:
			salesTax = salesAmt * 0.05;
			totalDue = salesAmt + salesTax; 
			break; 
		}
		
		System.out.println(HEADING);
		System.out.println(customerNumber + " " + customerName + " $" + salesAmt + " $" + salesTax + " $" + totalDue);
	}

}
