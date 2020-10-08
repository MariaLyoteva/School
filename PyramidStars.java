package pyramidStars;
import java.util.Scanner;
public class PyramidStars {
	 public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of rows needed to print the pattern ");

	        int rows = scanner.nextInt();
	        System.out.println("-- Printing the pattern --");
	        System.out.println();
	        
	        for (int i=1; i<=rows; i++)
	        {
	            for (int j=1; j<i; j++) 
	            { 
	                System.out.print(" "); 
	            } 
	            for (int k=rows; k>=i; k--)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}

