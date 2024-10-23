package lab01;

import java.util.Scanner;
public class task03 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the first number of the Fibonacci sequence: ");
	        int a1 = scanner.nextInt();
	        System.out.print("Enter the second number of the Fibonacci sequence: ");
	        int a2 = scanner.nextInt();

	      
	        System.out.print("Enter the position of the desired Fibonacci number: ");
	        int n = scanner.nextInt();

	      
	        int nthFibonacci = calculateNthFibonacci(a1, a2, n);

	      
	        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
	    }

	    public static int calculateNthFibonacci(int a1, int a2, int n) {
	        if (n == 1) {
	            return a1;
	        } else if (n == 2) {
	            return a2;
	        } else {
	            int prev = a1;
	            int current = a2;
	            for (int i = 3; i <= n; i++) {
	                int next = prev + current;
	                prev = current;
	                current = next;
	            }
	            return current;
	        }
	    }
	
}
