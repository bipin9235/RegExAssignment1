package till_selection_20_july;
/*
 * Sol.3: Write a program to add two dimensions (specified in foots and inches)
 */

import java.util.Scanner;


public class AddTwoDimension{

	public static void main(String[] args) {
		//Creation of Scanner Object
		Scanner sc=new Scanner(System.in);
		
		// Variable declarations
		float foot=0.0f;
		float inch=0.0f;
		double resultFoot=0;
		
		//Input variables
		System.out.print("Enter Dimension in Foot: ");
		foot=sc.nextFloat();
		
		System.out.print("Enter Dimension in inch: ");
		inch=sc.nextFloat();
		
		//Logic
		/*
		 * 1foot=12 inch
		 */
		resultFoot = foot + inch/12;
		
		System.out.println("Result : "+resultFoot+" foot");
		
		sc.close();

	}

}
