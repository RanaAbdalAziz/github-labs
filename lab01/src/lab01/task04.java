package lab01;

import java.util.Scanner;

public class task04 {
	

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	   
	        System.out.print("Enter the original price of the item: ");
	        double originalPrice = scanner.nextDouble();

	
	        System.out.print("Enter the markup percentage(%): ");
	        double markupPercentage = scanner.nextDouble();

	    
	        System.out.print("Enter the sales tax rate (%): ");
	        double salesTaxRate = scanner.nextDouble();

	       
	        double markupAmount = originalPrice * (markupPercentage / 100);
	        double sellingPrice = originalPrice + markupAmount;

	       
	        double salesTax = sellingPrice * (salesTaxRate / 100);

	       
	        double finalPrice = sellingPrice + salesTax;

	       
	        System.out.println("\nItem Price Breakdown:");
	        System.out.println("Original Price: " + originalPrice + "$");
	        System.out.println("Markup Percentage: " + markupPercentage + "%");
	        System.out.println("Store's Selling Price: " + sellingPrice + "$");
	        System.out.println("Sales Tax Rate: " + salesTaxRate + "%");
	        System.out.println("Sales Tax: " + salesTax + "$");
	        System.out.println("Final Price: " + finalPrice + "$");

	       
	        scanner.close();
	    }
	}


