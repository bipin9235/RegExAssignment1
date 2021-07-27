/*
   #Task6:Write a program to calculate simple interest (make sure to take principle amount, interest rate and time period from console)
   Registration ID: JIRSS1132
   Name: Bipin Kumar
 */
package till_selection_20_july;

import java.util.Scanner;


public class SimpleInterest {

	public static void main(String[] args) {
		//Declaration of Scanner Object
		Scanner sc=new Scanner(System.in);
		
		// Variables declarations
		double pAmount=0.0f;
		float rate=0.0f;
		float time=0.0f;
		double si=0.0f;
		System.out.println("-----Simple Interest Calculator-----");
		System.out.println("Enter Principle Amount: ");
		pAmount=sc.nextFloat();
		
		System.out.println("Enter Interest Rate: ");
		rate=sc.nextFloat();
		
		System.out.println("Enter Time Period: ");
		time=sc.nextFloat();
		
		//Logic for simple interest
		si=(pAmount*rate*time)/100;
		
		System.out.println("Simple Interest : "+si);
		
		sc.close();

	}

}
