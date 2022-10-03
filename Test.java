package CS130StudyGuide;

import java.util.Scanner;
import java.text.NumberFormat;


public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double volume;  
		
		System.out.println("Height: ");
		Double H = scan.nextDouble();
		System.out.println("Length: ");
		Double L = scan.nextDouble();
		System.out.println("Width: ");
		Double W = scan.nextDouble();
		
		volume = (H*L*W);
		
		System.out.println("The Volume of the Shape is: " + volume);

	}

}
