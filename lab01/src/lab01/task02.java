package lab01;

import java.io.*;
import java.util.*;

public class task02 {
	

	    public static void main(String[] args) throws IOException
	        {
	            Scanner input=new Scanner(System.in);
	             int size=5;
	            PrintWriter outfile=new PrintWriter("num.txt");
	            for (int i=0;i<size;i++)
	            {
	                System.out.println("Enter the number:");
	                outfile.println(( input.nextInt()));

	            }
	            outfile.close();
	             Scanner infile=new Scanner( new FileReader("num.txt"));
	             int n,evensum=0,oddsum=0;
	             for (int i=0;i<size;i++) {
	                 n = infile.nextInt();
	                 if (n % 2 == 0) {
	                     evensum = evensum + n;
	                 } else {
	                     oddsum += n;
	                 }
	             }
	             infile.close();
	            System.out.println("The Even sum is:"+evensum+"\nThe Odd sum is:"+oddsum);
	        }
	    
	    }
	


