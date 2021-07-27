package till_selection_20_july;
/*
 * Write a program to calculate gross salary from following components
	basic salary (in INR), hra (in percentage), da (in percentage), ta (in percentage), pf (in percentage)
 */

import java.util.Scanner;


public class GrossSalaryCalculator {

	public static void main(String[] args) {
		//Scanner Object Creation
		Scanner sc=new Scanner(System.in);
		
		// Variables declaration
		int basicSalary=0;
		float hra=0.0f;// House Rent Allowance
		float da=0.0f;// Dearness Allowance
		float ta=0.0f;// Travel Allowance
		float pf=0.0f;// Provident Fund
		double grossSalary=0.0;
		
		// Input for console
		System.out.print("Enter Basic Salary(INR): ");
		basicSalary=sc.nextInt();
		
		System.out.print("Enter HRA(in percent): ");
		hra=sc.nextFloat();
		
		System.out.print("Enter DA(in percent): ");
		da=sc.nextFloat();
		
		System.out.print("Enter TA(in percent): ");
		ta=sc.nextFloat();
		
		System.out.print("Enter PF(in percent): ");
		pf=sc.nextFloat();
		
		// Logic
		/* 
		 * Gross Salary=basicSalary+basicSalary*hra/100+basicSalary*da/100+basicSlary*ta/100
		 *     -basicSalary*pf/100
		 */
		grossSalary=basicSalary+(basicSalary*hra/100)+(basicSalary*da/100)+(basicSalary*ta/100)-(basicSalary*pf/100);
		
		System.out.println("Gross Salary : "+grossSalary);
		
		sc.close();
	}

}
