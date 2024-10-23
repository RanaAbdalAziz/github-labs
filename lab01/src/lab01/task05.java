package lab01;

import java.util.Scanner;
public class task05 {

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	       
	        final double tex_rate = 0.14;
	        final double clothe_expense = 0.10;
	        final double school_expense = 0.01;
	        final double personal_bond = 0.25;
	        final double parent_bond = 0.50;

	       
	        System.out.print("Enter your hourly pay rate: ");
	        double pay_rate = scanner.nextDouble();

	        System.out.print("Enter the number of hours you worked each week: ");
	        double hours_per_week = scanner.nextDouble();

	       
	        double income_before_tax = pay_rate * hours_per_week * 4; // 5 weeks

	        
	        double taxes = income_before_tax * tex_rate;
	        double incomeAfterTax = income_before_tax - taxes;

	        
	        double clothesExpenses = incomeAfterTax * clothe_expense;

	        double schoolSuppliesExpenses = incomeAfterTax * school_expense;

	        double remainingIncome = incomeAfterTax - (clothesExpenses + schoolSuppliesExpenses);

	        double savingsBondsExpenses = remainingIncome * personal_bond;

	        double parentsContribution = savingsBondsExpenses * parent_bond;

	        System.out.println("\nSummary of Income and Expenses:");
	        System.out.printf("Income before taxes: $%.2f\n", income_before_tax);
	        System.out.printf("Income after taxes: $%.2f\n", incomeAfterTax);
	        System.out.printf("Money spent on clothes and accessories: $%.2f\n", clothesExpenses);
	        System.out.printf("Money spent on school supplies: $%.2f\n", schoolSuppliesExpenses);
	        System.out.printf("Money spent on savings bonds: $%.2f\n", savingsBondsExpenses);
	        System.out.printf("Money your parents spent on additional savings bonds: $%.2f\n", parentsContribution);

	   
	        scanner.close();
	    }
	}

