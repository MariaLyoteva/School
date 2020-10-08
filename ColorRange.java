package ColorRange;
import java.util.Scanner;
public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a color code");
    double code = input.nextDouble();
    if(code >= 380.0 && code<= 450.0 )
    	System.out.println("Violet");
    else if (code > 450.0 && code <= 495.0)
    	System.out.println("Blue");
    else if (code > 495.0 && code <= 570.0)
    	System.out.println("Green");
    else if (code > 570.0 && code <= 590.0)
    	System.out.println("Yellow");
    else if (code > 590.0 && code <= 620.0)
        System.out.println("Orange");	
    else if  (code > 620.0 && code <= 750.0)
        System.out.println("Red");	
    else
    	 System.out.println("The entered wavelength is not a part of the visible spectrum ");	
        }

}
