/*
 Author: Luis M. Rivera Machin
 Date: 02/12/2023
 Description: A program that computes a person's taxable income based on their taxpayer status and annual income.
 */

import java.util.Scanner;

public class ComputingTaxes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int status = 0;
		int income;
		double tax = 0;
		String userStatus;
		
		// Get taxpayer status and income
		System.out.println("Are you single, married filing jointly, married filing separately or head of household? ");
		userStatus = scnr.nextLine();
		System.out.println("What is your annual income? (only enter digits)");
		income = scnr.nextInt();
		
		
		switch(userStatus) { // Determine the status of the taxpayer based on userInput
		case "single": status = 0; break;
		case "married filing jointly": status = 1; break;
		case "married filing separately": status = 2; break;
		case "head of household": status = 3; break;
		}
		
		if (status == 0) { // Compute tax for single filers
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15; 
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
				(372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		} //ends single status taxpayer
		
		else if (status == 1) { // Compute tax for married filing jointly
			if (income <= 16700)
				tax = income * 0.10;
			else if (income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				(income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				(137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				(137050 - 67900) * 0.25 + (208850 - 67900) * 0.28 +
				(income - 372950) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
				(137050 - 67900) * 0.25 + (208850 - 67900) * 0.28 +
				(372950 - 372950) * 0.33 + (income - 372950) * 0.35;
		} // ends married filing jointly
		
		else if (status == 2) { // Compute tax for married filing separately
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(income - 33950) * 0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186472)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(68525 - 33950) * 0.25 + (104425 - 33950) * 0.28 +
				(income - 186475) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(68525 - 33950) * 0.25 + (104425 - 33950) * 0.28 +
				(income - 186475) * 0.33 + (income - 186475) * 0.35;
		} // ends married filing separately
		
		else if (status == 3) { // Compute tax for head of household
			if (income <= 11950)
				tax = 11950 * 0.10;
			else if (income <= 33950)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15;
			else if (income <= 68525)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
				(117450 - 45500) * 0.25;
			else if (income <= 104425)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
				(117450 - 45500) * 0.25 + (190200 - 45500) * 0.28;
			else if (income <= 186472)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
				(117450 - 45500) * 0.25 + (190200 - 45500) * 0.28 +
				(income - 372950) * 0.33;
			else
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
				(117450 - 45500) * 0.25 + (190200 - 45500) * 0.28 +
				(income - 372950) * 0.33 + (income - 372950) * 0.35;
		} // ends head of household
		
		System.out.printf("You will pay $%,.2f in taxes this year.\n", tax); // Show the user his/her tax amount
		
	} // ends main	
} // ends class

