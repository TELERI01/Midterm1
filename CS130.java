package CS130StudyGuide;


import java.util.Scanner;
import java.text.NumberFormat;

public class CS130 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		NumberFormat P = NumberFormat.getPercentInstance();
		
		NumberFormat C = NumberFormat.getCurrencyInstance();
		
		System.out.println("Enter cost: ");
		
		double subtotal = scan.nextDouble();
		
		double TAX_RATE = 0.06;
		
		double tax = subtotal * TAX_RATE;
		
		double total_tax = subtotal+tax;
		
		System.out.println("Tax:" + C.format(tax) +"Tax Rate" + (P.format(TAX_RATE)));
		
		
		System.out.println("The total cost is Total Cost: " + total_tax);
		
	}

}
